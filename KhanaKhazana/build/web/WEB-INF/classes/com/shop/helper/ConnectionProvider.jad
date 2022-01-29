// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConnectionProvider.java

package com.shop.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider
{

    public ConnectionProvider()
    {
    }

    public static Connection getConnection()
    {
        try
        {
            if(con == null)
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "root");
            }
        }
        catch(Exception exp)
        {
            exp.printStackTrace();
        }
        return con;
    }

    private static Connection con;
}
