package com.retail;

import java.sql.*;
import java.util.Scanner;

public class addProduct {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost/database1";
        String user = "root";
        String password = "12345678Abcd.";

        Scanner sc = new Scanner(System.in);

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            System.out.println("enter Product ID");
            int pid = sc.nextInt();
            System.out.println("enter Product Name");
            String pname = sc.next();
            System.out.println("enter Quantity");
            int q = sc.nextInt();
            System.out.println("enter Price");
            int price = sc.nextInt();

            String sql = "insert into product Values ('"+pid+"', '"+pname+"', '"+q+"', '"+price+"')";
            stmt.executeUpdate(sql);
            System.out.println("inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
