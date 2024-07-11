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
public class pass extends HttpServlet {

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
            out.println("<title>Servlet pass</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet pass at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           response.setContentType("text/html");
    PrintWriter out= response.getWriter();
    HttpSession session=request.getSession(false);
    if(session!=null){
    String nam=(String)session.getAttribute("uname"); 
    out.println("<!DOCTYPE html>");
out.println("<html lang='en'>");
out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
   out.println(" <title>KIMINA</title>");
    out.println("<link rel='stylesheet' href='styles.css'>");
  out.println("<link rel='stylesheet' href='styl.css'>");
 out.println("</head>");


 out.println("<body>");
    out.println(" <div class='container'>");
         out.println("<header>");
             out.println("<div class='top-banner'>");
                out.println(" <span>FINANCIAL COOPERATIVE AT IPRC KARONGI</span>");
            out.println(" </div>");
             out.println("<div class='logo-nav'>");
                out.println(" <div class='logo'>");
                    out.println(" <img src='one.png' alt='KIMINA'> ");
                   out.println("  <span>KIMINA</span>");
               out.println("  </div>");
                out.println(" <nav>");
                  out.println("   <ul>");
                        out.println(" <li><a href='#'>Home</a></li>");
                        out.println(" <li><a href='#'>Committee</a></li>");
                        out.println(" <li><a href='#'>Member</a></li>");
                        out.println(" <li><a href='logout'>Logout</a></li>");
                    out.println(" </ul>");
                out.println(" </nav>");
           out.println("  </div>");
       out.println("  </header>");
       out.println(" <main>");
           
           out.println("  <div class='content'>");
               out.println("  <h1>WELCOME<br>TO ADMIN DASHBOARD</h1>");
            out.println(" </div>");
                  out.println(" </main>");
                  out.println("  <div><footer>allright are reseverd&copy; Designed by IKIMINA &trade;</footer></div>");
    out.println(" </div>");
out.println(" </body>");
out.println(" </html>");
  }
  else{               
        out.println("<p style='color:white;'>Please Login First!</p>");
        request.getRequestDispatcher("log.html").include(request, response);
    }
    }
    }

   
