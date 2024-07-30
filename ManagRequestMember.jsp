<%-- 
    Document   : ManagRequestMember
    Created on : Jul 29, 2024, 9:32:19 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Access.AccessData"%>
<%@page import="db.Connect"%>
<%@page import="model.RequestModel"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       String firstname=request.getParameter("fname");
String lastname=request.getParameter("lname");
String email=request.getParameter("mail");
String phone=request.getParameter("fone");
String requestdate=request.getParameter("dat");
String reasontojoin=request.getParameter("rea");
String status=request.getParameter("stat");
RequestModel r=new RequestModel(0,firstname,lastname,email,phone,requestdate,reasontojoin,status);
       AccessData ad=new AccessData();
       ad.addRequest(r);
       response.sendRedirect("/finalProject/thank.jsp");
       %>
    </body>
</html>
