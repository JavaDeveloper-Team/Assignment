/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package MyServletFiles;
import Access.AccessData;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class EditRequest extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
        String idTemp=request.getParameter("id");
        int id=Integer.parseInt(idTemp);
        request.setAttribute("getReqById", AccessData.getReqById(id));
        request.getRequestDispatcher("editRequest.jsp").forward(request, response);
        }
        catch(Exception e){e.printStackTrace();}
    }

}
