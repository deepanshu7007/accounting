// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UserDao.java

package com.shop.dao;

import com.shop.entities.User;
import java.sql.*;

public class UserDao
{

    public UserDao(Connection con)
    {
        this.con = con;
    }

    public User getUserByEmailAndPassword(String email, String password)
    {
        User user = null;
        try
        {
            String query = "SELECT * FROM USER WHERE email = ? and passwordHash=? ";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet set = pstmt.executeQuery();
            if(set.next())
            {
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
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return user;
    }

    public boolean saveUser(User user)
    {
        boolean f = false;
        try
        {
            String query = "insert into user(firstName,email,passwordHash,intro) values (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getAddress());
            stmt.executeUpdate();
            f = true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }

    private Connection con;
}
