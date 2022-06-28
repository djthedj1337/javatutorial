package com.jin.rose.JDBC;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;





public class RestaurantGuideJDBC {
    public static void main(String[] args) {
/*
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide","root","Knights123*");
            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("select * from Locations");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+ rs.getString(2) + " " + rs.getString(3));
            con.close();

        } catch(Exception e){ System.out.println(e);}
    }
    */
        List<String> locations = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide", "root", "Knights123*");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from Locations");
            while (rs.next()) {
                locations.add(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}

/*        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RestaurantGuide", "root", "Knights123*");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from Locations");
            while (rs.next()) {
                locations.add(new Location(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(locations.toString());

    }

 */

