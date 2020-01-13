package com.retail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class deleteProduct {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost/database1";
        String user = "root";
        String password = "12345678Abcd.";

        Scanner sc = new Scanner(System.in);

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();


            System.out.println("enter Product Name to Delete");
            String pname = sc.next();
//            System.out.println("enter Product ID");
//            int pid = sc.nextInt();
//            System.out.println("enter Quantity");
//            int q = sc.nextInt();
//            System.out.println("enter Price");
//            int price = sc.nextInt();

            //String sql = "insert into product Values ('"+pid+"', '"+pname+"', '"+q+"', '"+price+"')";
            String sql = "delete from product where ProductName = '"+pname+"'";
            stmt.executeUpdate(sql);
            System.out.println("Deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
