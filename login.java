/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package submit;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class login extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
  
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  try{   
            response.setContentType("text/html");
            PrintWriter pw=response.getWriter();
            String url="jdbc:mysql://localhost:3306/ikimina_iprckarongi";
            String username="root";
            String passwor="";
            String fname=request.getParameter("username");
            String passw=request.getParameter("password");
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,username,passwor);
      Statement ps=con.createStatement();
                 ResultSet rs= ps.executeQuery("SELECT firstname,password FROM member WHERE firstname='"+fname+"' AND password='"+passw+"'");
           if(rs.next()&& !fname.equals("princess") && !passw.equals("nina") ) {
              HttpSession session=request.getSession();
           session.setAttribute("uname",fname); 
           pw.println("you'are successful logged in<br>");
 pw.println("<a href='dash'>GO TO DASHBOARD</a>");
            }
           else if(fname.equals("princess") && passw.equals("nina")){
 pw.println("you'are successful logged in<br>");
 pw.println("<a href='pass'>GO TO DASHBOARD</a>");
 }
  else if(fname.equals("Niyodusenga") && passw.equals("123")){
 pw.println("you'are successful logged in<br>");
 pw.println("<a href='adviser'>GO TO DASHBOARD</a>");
 }
             else{
           JOptionPane.showMessageDialog(new JFrame(), "Wrong username or password!");
           RequestDispatcher rd=request.getRequestDispatcher("log.html");
               rd.include(request, response);
           }
                      }
        catch(Exception e){
        e.printStackTrace();
        }
    
    }
}