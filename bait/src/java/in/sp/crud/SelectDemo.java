/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.sp.crud;

/**
 *
 * @author pares
 */

import java.sql.*;
public class SelectDemo {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Paresh@2421");
        
        PreparedStatement ps = con.prepareStatement("select * from register");
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            String name1 = rs.getString("name");
            System.out.println(name1);
            
            String email1 = rs.getString("email");
            System.out.println(email1);
            
            String pass1 = rs.getString("password");
            System.out.println(pass1);
            
            String gender1 = rs.getString("gender");
            System.out.println(gender1);
            
            String city1 = rs.getString("city");
            System.out.println(city1);
            
            System.out.println("-------------------------------------------------------");
        }
        
        con.close();
    }
}
