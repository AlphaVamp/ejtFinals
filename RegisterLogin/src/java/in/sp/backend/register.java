/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.sp.backend;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 *
 * @author pares
 */
@WebServlet("/regForm")
public class register extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        String myname = req.getParameter("name1");
        String myemail = req.getParameter("email1");
        String mypass = req.getParameter("password1");
        String mygender = req.getParameter("gender1");
        String mycity = req.getParameter("city1");
        PrintWriter out = res.getWriter();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1", "root", "Paresh@2421");
            
            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
            ps.setString(1, myname);
            ps.setString(2, myemail);
            ps.setString(3, mypass);
            ps.setString(4, mygender);
            ps.setString(5, mycity);
            
            int i = ps.executeUpdate();
            if(i>0){
                res.setContentType("text/html");
                out.print("User Registered Successfully");
                RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
                rd.include(req, res);
            }
            else{
                 res.setContentType("text/html");
                out.print("User not registered");
                RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
                rd.include(req, res);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
                res.setContentType("text/html");
                out.print("Exception occured: "+e.getMessage());
                RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
                rd.include(req, res);
        }
    }
}   
