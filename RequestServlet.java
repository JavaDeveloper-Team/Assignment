/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package MyServletFiles;
import java.sql.*;
import Access.AccessData;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
public class RequestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
           try{
               HttpSession session=request.getSession(false);
               session.getAttribute("uname");
        request.setAttribute("AllRequest", AccessData.showAll());
                request.getRequestDispatcher("JspController/DisplayRequest.jsp").forward(request, response);

    }
           catch(SQLException | ClassNotFoundException e){
           e.printStackTrace();
           }
    }
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
           try{
               HttpSession session=request.getSession(false);
               session.getAttribute("uname");
        request.setAttribute("AllRequest", AccessData.showAll());
                request.getRequestDispatcher("JspController/DisplayRequest.jsp").forward(request, response);

    }
           catch(SQLException | ClassNotFoundException e){
           e.printStackTrace();
           }
    }
    
}
