// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   User.java

package com.shop.entities;

import java.sql.Timestamp;

public class User
{

    public User(int id, String name, String email, String password, Timestamp dateTime, String address)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dateTime = dateTime;
        this.address = address;
    }

    public User()
    {
    }

    public User(String name, String email, String password, String address)
    {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Timestamp getDateTime()
    {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime)
    {
        this.dateTime = dateTime;
    }

    public String getProfile()
    {
        return profile;
    }

    public void setProfile(String profile)
    {
        this.profile = profile;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    private int id;
    private String name;
    private String email;
    private String password;
    private Timestamp dateTime;
    private String address;
    private String profile;
}
