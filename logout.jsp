<%-- 
    Document   : logout
    Created on : Jul 21, 2024, 8:54:40 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>

<%-- Get the session object --%>
<%
    
    if (session != null) {
        session.invalidate(); // Invalidate the session
    }
    response.sendRedirect("index.html"); // Redirect to login page or any other appropriate page
%>

