package in.sp.crud;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pares
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
    public static void main(String[] args) throws Exception
    {
            //user values
            String name1 = "Amit";
            String email1 = "amit@gmail.com";
            String password1 = "amit123";
            String gender1 = "male";
            String city1 = "thane";
               
            //step1: Load and register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step2: establish connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Paresh@2421");
            
            //step3: create statement 
            PreparedStatement ps = con.prepareStatement("Insert into register values(?,?,?,?,?)");
            ps.setString(1, name1);
            ps.setString(2, email1);
            ps.setString(3, password1);
            ps.setString(4, gender1);
            ps.setString(5, city1);
            
            //step4: execute sql statement
            int i = ps.executeUpdate();
            
            //step5: process the result(this probably is that step)
            if(i>0){
                System.out.println("Success");
            }
                    
            else{
                System.out.println("Failed");
            }
            
            //step6: close the connection
            con.close();
    }
}
