package com.jin.rose.JDBC;

import java.sql.*;
public class JDBCtest {
    public static void main(String args[]){
        System.out.println("...");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("000...");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/gj_db2","root","rootpassword");
            System.out.println("111...");
            Statement stmt=con.createStatement();
            System.out.println("222...");
            ResultSet rs=stmt.executeQuery("select * from product");
            System.out.println("333...");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+ rs.getString(2));
            con.close();

        } catch(Exception e){ System.out.println(e);}
    }
}