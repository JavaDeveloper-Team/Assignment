<%-- 
    Document   : login
    Created on : Jul 21, 2024, 6:36:48 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>

<c:set var="name" value="${param.username}" />
<c:set var="pass" value="${param.password}" />

<c:set var="isValidUser" value="false" />
<c:set var="destination" value="index.html" />

<c:if test="${not empty name and not empty pass}">
    <c:choose>
        <c:when test="${name eq 'admin' and pass eq 'admin@123'}">
            <c:set var="isValidUser" value="true" />
            <c:set var="destination" value="adminDashboard1.jsp" />
            <% session.setAttribute("username", "admin"); %>
        </c:when>
        <c:when test="${name eq 'member' and pass eq 'member@123'}">
            <c:set var="isValidUser" value="true" />
            <c:set var="destination" value="memberDashboard1.jsp" />
            <% session.setAttribute("username", "member"); %>
        </c:when>
        <c:otherwise>
            <c:set var="destination" value="pageError.jsp" />
        </c:otherwise>
    </c:choose>

    <c:if test="${isValidUser}">
        <jsp:forward page="${destination}" />
    </c:if>
    <c:if test="${!isValidUser}">
        <jsp:forward page="${destination}" />
    </c:if>
</c:if>

<%--<c:set var="kc" value="${cookie.uname}" />
<c:if test="${not empty kc}">
    <c:redirect url="username.html"/>
</c:if>--%>
