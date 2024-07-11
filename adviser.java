/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package submit;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class adviser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet adviser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet adviser at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
    PrintWriter out= response.getWriter();
    HttpSession session=request.getSession(false);
    if(session!=null){
    String nam=(String)session.getAttribute("uname"); 
      out.println("  <!DOCTYPE html>");
 out.println(" <html>");
 out.println(" <head>");
	 out.println(" <meta charset='utf-8'>");
	 out.println(" <meta name='viewport' content='width=device-width, initial-scale=1'>");
	 out.println(" <title>adviser</title>");
	 out.println("<link rel='stylesheet' href='sty.css'>");
         out.println("</head>");
out.println("<body>");
	out.println("<div class='top-banner'>");
               out.println(" <span>FINANCIAL COOPERATIVE AT IPRC KARONGI</span>");
           out.println(" </div>");
out.println("<nav>");
                    out.println("<ul>");
                        out.println("<li><a href='#'>Home</a></li>");
                        out.println("<li><a href='#'>About Us</a></li>");
                        out.println("<li><a href='#'>Loan</a></li>");
                        out.println("<li><a href='#'>Saving</a></li>");
                       out.println(" <li><a href='#'>Advise</a></li>");
                      out.println(" <li><a href='logout'>Logout</a></li>");
                    out.println("</ul>");
                out.println("</nav>");
               out.println(" <div><footer>allright are reseverd&copy; Designed by IKIMINA &trade;</footer></div>");
  
out.println("</body>");
out.println("</html>");
     }
  else{               
        out.println("<p style='color:white;'>Please Login First!</p>");
        request.getRequestDispatcher("log.html").include(request, response);
    }
    }
    }


