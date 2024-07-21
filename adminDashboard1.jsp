<%-- 
    Document   : adminDashboard1
    Created on : Jul 21, 2024, 8:20:30 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%-- Get the session object --%>
<%
  
    String username = (session != null) ? (String) session.getAttribute("username") : null;
    if (username == null || !username.equals("admin")) {
        response.sendRedirect("index.html"); // Redirect to login page if session is invalid or not an admin
    }
%>
<!DOCTYPE html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>KIMINA</title>
    <link rel="stylesheet" href="styles.css">
    <style type="text/css">
    body {
    margin: 0;
    font-family: Arial, sans-serif;
    background: #1a1a60;
}

.container {
    max-width: 700px;
    margin: 0 auto;
    padding: 20px;
    background: #fff;
    border-radius: 20px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    position: relative;
    overflow: hidden;
}

header {
    display: flex;
    flex-direction: column;
}

.top-banner {
    background-color: #009933;
    color: white;
    font-weight: bold;
    text-align: center;
    padding: 10px 0;
    border-radius: 20px 20px 0 0;
}

.logo-nav {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 20px 0;
}

.logo {
    display: flex;
    align-items: center;
}

.logo img {
    width: 40px;
    height: 40px;
    margin-right: 10px;
}

nav ul {
    list-style: none;
    display: flex;
    gap: 20px;
    padding: 0;
    margin: 0;
    background: #4f4fff;
}

nav a {
    text-decoration: none;
    color: white;

    padding: 10px 20px;
    border-radius: 5px;
    font-weight: bold;
}

main {
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 50px 0;
}

.content {
    max-width: 600px;
    margin-right: 400px;
}

.content h1 {
    font-size: 48px;
    margin: 0;
    line-height: 1.2;
    color: #0055a5;
}
</style>
</head>


<body>
    <div class="container">
        <header>
            <div class="top-banner">
                <span>FINANCIAL COOPERATIVE AT IPRC KARONGI</span>
            </div>
            <div class="logo-nav">
                <div class="logo">
                    <img src="one.png" alt="KIMINA"> 
                    <span>KIMINA</span>
                </div>
                <nav>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Committee</a></li>
                        <li><a href="#">Member</a></li>
                        <li><a href="logout.jsp">Logout</a></li>
                    </ul>
                </nav>
            </div>
        </header>
        <main>
          
            <div class="content">
                <h1>WELCOME<br>TO ADMIN DASHBOARD</h1>
                  <h2>you're <%=username%></h2>
            </div>
            
        </main>
    </div>
</body>
</html>