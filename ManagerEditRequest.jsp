<%-- 
    Document   : ManagerEditRequest
    Created on : Jul 29, 2024, 7:49:02 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Access.AccessData"%>
<%@page import="model.RequestModel"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page errorPage="myErrorPage.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        String idTemp=request.getParameter("rmid");
        int id=Integer.parseInt(idTemp);
        String firstname=request.getParameter("firstname");
String lastname=request.getParameter("lastname");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
String requestdate=request.getParameter("request_date");
String reasontojoin=request.getParameter("reason_to_join");
String status=request.getParameter("status");
RequestModel r=new RequestModel(0,firstname,lastname,email,phone,requestdate,reasontojoin,status);
       AccessData ad=new AccessData();
       ad.edit(id,firstname,lastname,email,phone,requestdate,reasontojoin,status);
       response.sendRedirect("/finalProject/RequestServlet");
                %>
    </body>
</html>
