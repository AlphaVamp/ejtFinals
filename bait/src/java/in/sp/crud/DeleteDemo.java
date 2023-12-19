package in.sp.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pares
 */
public class DeleteDemo {
    public static void main(String[] args) throws Exception
    {
        
        String email1 = "Param@gmail.com";
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Paresh@2421");
        
        PreparedStatement ps = con.prepareStatement("delete from register where email=?");
        ps.setString(1, email1);
        
        int i = ps.executeUpdate();
        
        if(i>0){
            System.out.println("Deleted");
        }
        else
        {
           System.out.println("Delete failed");

        }
        con.close();
    }
}
