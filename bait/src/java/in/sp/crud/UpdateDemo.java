package in.sp.crud;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pares
 */
import java.sql.*;

public class UpdateDemo {
    public static void main(String[] args) throws Exception
    {
        
        String city1="Mumbai";
        String email1 = "Param@gmail.com";
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Paresh@2421");
        
        PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
        ps.setString(1, city1);
        ps.setString(2, email1);
        
        int i = ps.executeUpdate();
        
        if(i>0){
            System.out.println("Updated");
        }
        else
        {
           System.out.println("Update failed");

        }
        con.close();
    }
}
