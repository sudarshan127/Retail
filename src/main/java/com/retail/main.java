package com.retail;

import java.sql.*;

public class main {
    public static void main(String [] args) {

        String url = "jdbc:mysql://localhost/database1";
        String user = "root";
        String password = "12345678Abcd.";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String s = "select * from database1.product";
            ResultSet rs = stmt.executeQuery(s);
            while(rs.next())
                System.out.println(rs.getString("ProductName"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
