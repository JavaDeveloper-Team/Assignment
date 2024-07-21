<%-- 
    Document   : memberDashboard1
    Created on : Jul 21, 2024, 8:48:37 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%-- Get the session object --%>
<%
  
    String username = (session != null) ? (String) session.getAttribute("username") : null;
    if (username == null || !username.equals("member")) {
        response.sendRedirect("index.html"); // Redirect to login page if session is invalid or not an admin
    }
%>
<!DOCTYPE html>


<html>
    <head>
        <title>Executive Committee</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
<h1 style="border-top-right-radius:15px;border-top-left-radius: 15px;color: white;background-color:darkgreen ;text-align: center">FINANCIAL COOPERATIVE AT IPRC KARONGI</h1>
<nav style="background-color: darkblue;height:2em;margin-top: -1.5em;text-align: center;">
<ul style="">
<li style="display: inline-block;font-size: 20px;padding-right:1.9em;padding-top: 0.2em;">
<a href="jo.html" style="text-decoration: none;color: white">HOME</a> 
<a href="" style="text-decoration: none;padding-left: 0.5em;color: white">ABOUT US</a> 
<a  href="" style="text-decoration: none;padding-left: 0.5em;color: white">LOAN</a> 
<a  href="" style="text-decoration: none;padding-left: 0.5em;color: white">SAVING</a> 
<a  href="" style="text-decoration: none;padding-left: 0.5em;color: white">REQUEST</a> 
<a  href="logout.jsp" style="text-decoration: none;padding-left: 0.5em;color: white">LOGOUT</a> 
</li>
</ul>
</nav>
 <h2>you're <%=username%></h2>
</body>
</html>

