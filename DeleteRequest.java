/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package MyServletFiles;

import Access.AccessData;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "DeleteRequest", urlPatterns = {"/DeleteRequest"})
public class DeleteRequest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       try{
       int id=Integer.parseInt(request.getParameter("id"));
       AccessData ad=new AccessData();
       ad.delete(id);
       request.getRequestDispatcher("RequestServlet").forward(request, response);
       }
       catch(Exception e){ e.printStackTrace();}
            
        
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       try{
       int id=Integer.parseInt(request.getParameter("id"));
       AccessData ad=new AccessData();
       ad.delete(id);
       request.getRequestDispatcher("RequestServlet").forward(request, response);
       }
       catch(Exception e){ e.printStackTrace();}
            
        
    }
}
