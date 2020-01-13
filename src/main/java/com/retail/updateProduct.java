package com.retail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class updateProduct {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost/database1";
        String user = "root";
        String password = "12345678Abcd.";

        Scanner sc = new Scanner(System.in);

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();


            System.out.println("enter Product Name to Update");
            String pname = sc.next();

            System.out.println("enter new price");
            int newprice = sc.nextInt();

            String sql = "update product set Price = '"+newprice+"' where ProductName = '"+pname+"'";
            stmt.executeUpdate(sql);
            System.out.println("updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
