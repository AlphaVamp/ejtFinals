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
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author pares
 */
@WebServlet("/myLogin")
public class Login extends HttpServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
    String myemail = request.getParameter("email1");
    String mypass = request.getParameter("pass1");
    PrintWriter out = response.getWriter();
    
    if(myemail.equals("paresh@gmail.com") && mypass.equals("paresh123"))
    {
//       request.setAttribute("name_key", "Paresh Nair");
       HttpSession session = request.getSession();
       session.setAttribute("name_key","Paresh");
       
       RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
       rd.forward(request, response);
    }
    else
    {
        response.setContentType("text/html");
        out.print("Email ID or Password is not valid");
        RequestDispatcher rd = request.getRequestDispatcher("/index.html");
        rd.include(request, response);
    }
   
    }
}
