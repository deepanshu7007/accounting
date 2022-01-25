/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.dao;

import com.shop.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }

    public User getUserByEmailAndPassword(String email, String password) {
        User user = null;
        try {
            String query = "SELECT * FROM USER WHERE email = ? and passwordHash=? ";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet set = pstmt.executeQuery();
            if (set.next()) {
                user = new User();
                String name = set.getString("firstname");
                user.setName(name);
                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("passwordHash"));
                user.setAddress(set.getString("Address"));
                user.setProfile(set.getString("ProfilePhoto"));
                user.setDateTime(set.getTimestamp("registeredAt"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    //method to insert user to database
    public boolean saveUser(User user) {
        boolean f = false;
        try {

            String query = "insert into user(firstName,email,passwordHash,intro) values (?,?,?,?)";
            PreparedStatement stmt = this.con.prepareStatement(query);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getAddress());
            stmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
