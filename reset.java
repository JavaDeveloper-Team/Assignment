package validateLogin;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class reset extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = generatePassword(12);
        try {
            sendEmail(email, password);
            
        } catch (EmailException ex) {
            Logger.getLogger(reset.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            updatePasswordInDatabase(email, password);
            response.getWriter().write("Password reset successfully.");
        } catch (SQLException ex) {
            Logger.getLogger(reset.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+[]{}|;:,.<>?";
    private static final String ALL_CHARS = UPPER + LOWER + DIGITS + SPECIAL;
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generatePassword(int length) {
        if (length < 8) {
            throw new IllegalArgumentException("Password length should be at least 8 characters");
        }

        StringBuilder password = new StringBuilder(length);

        // Ensure the password has at least one of each type of character
        password.append(UPPER.charAt(RANDOM.nextInt(UPPER.length())));
        password.append(LOWER.charAt(RANDOM.nextInt(LOWER.length())));
        password.append(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
        password.append(SPECIAL.charAt(RANDOM.nextInt(SPECIAL.length())));

        // Fill the rest of the password with random characters
        for (int i = 4; i < length; i++) {
            password.append(ALL_CHARS.charAt(RANDOM.nextInt(ALL_CHARS.length())));
        }
      // Shuffle the characters in the password to avoid predictable sequences
        char[] passwordArray = password.toString().toCharArray();
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int j = RANDOM.nextInt(i + 1);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[j];
            passwordArray[j] = temp;
        }

        return new String(passwordArray);
    }

    private void sendEmail(String useremail, String password) throws EmailException {
        // Send email using JavaMail API and Apache Commons Email library
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("niyomugengaprincess@gmail.com", "lcyjnmpnnqrhkrud"));
        email.setSSLOnConnect(true);
        email.setStartTLSEnabled(true);
        email.setFrom("noreply@gmail.com");
        email.setSubject("Reset Password");

        String messageText = "Here is your password: " + password;

        email.setMsg(messageText);
        email.addTo(useremail);
        email.send();
    }

    private void updatePasswordInDatabase(String email, String password) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/it2024"; 
        String user = "root";
        String dbPassword = ""; 

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                throw new SQLException("JDBC Driver not found.", ex);
            }
            conn = DriverManager.getConnection(url, user, dbPassword);
            String sql = "UPDATE users SET password = ? WHERE email = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, password);
            pstmt.setString(2, email);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated == 0) {
                throw new SQLException("No user found with the provided email.");
            }
        } finally {
            if (pstmt != null) {
                pstmt.close();   
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
