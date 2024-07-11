package submit;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class signup extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet signup</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet signup at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            response.setContentType("text/html");
            PrintWriter pw=response.getWriter();
            String fname=request.getParameter("firstname");
        String lname=request.getParameter("lastname");
         String email=request.getParameter("email");
          String address=request.getParameter("address");
           String fone=request.getParameter("phone");
            String passw=request.getParameter("password");
             String cpassw=request.getParameter("confirm_password");
            String url="jdbc:mysql://localhost:3306/ikimina_iprckarongi";
            String username="root";
            String password="";
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,username,password);
       PreparedStatement ps=con.prepareStatement("INSERT INTO member(firstname,lastname,email,address,phone,password,confirm_password) Values(?,?,?,?,?,?,?)");
             ps.setString(1, fname);
             ps.setString(2, lname);
             ps.setString(3, email);
             ps.setString(4, address);
             ps.setString(5, fone);
             ps.setString(6, passw);
             ps.setString(7, cpassw);
     ps.executeUpdate();
     JOptionPane.showMessageDialog(new JFrame(), "Sign up successful!"+" \n"+"now you can login");
       RequestDispatcher rd=request.getRequestDispatcher("/log.html");
               rd.forward(request, response);
        }
        catch(Exception e){
        e.printStackTrace();
        }
    }
}
