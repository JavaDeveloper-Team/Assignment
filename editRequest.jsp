<%-- 
    Document   : editRequest
    Created on : Jul 29, 2024, 7:46:50 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Page form</title>
    </head>
    <body>
        <h1>EDIT REQUEST</h1>
        <div>
        <c:forEach items="${getReqById}" var="p">
            <form action="JspController/ManagerEditRequest.jsp" method="post">
                <input type="hidden" name="rmid"  value="${p.id}"><br/>  
              FirstName:  <input type="text" name="firstname"  value="${p.firstname}"><br/>
              LastName:  <input type="text" name="lastname"  value="${p.lastname}"><br/>
              Email:  <input type="text" name="email"  value="${p.email}"><br/>
              Phone:  <input type="text" name="phone"  value="${p.phone}"><br/>
              Request Date:  <input type="text" name="request_date"  value="${p.request_date}"><br/>
              Reason To Join:  <input type="text" name="reason_to_join"  value="${p.reason_to_join}"><br/>
               Status:  <input type="text" name="status"><br/>
              <input type="submit"   value="Update data">
            </form>
        </c:forEach>
        </div>
    </body>
</html>
