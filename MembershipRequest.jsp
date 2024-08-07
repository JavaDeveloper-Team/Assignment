<%-- 
    Document   : MembershipRequest
    Created on : Jul 26, 2024, 11:58:59 AM
    Author     : user
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Financial Cooperative at IPRC Karongia</title>
    <style>
        body, html {
            font-family: Arial, sans-serif;
            margin: 1px;
            padding: 0;
           
        }
        
        .container {
            display: flex;
            height: 150%;
           
        }
        
        .sidebar {
            width: 250px;
            background-color: #5d5fef;
            color: white;
            padding: 10px;
            height: 60%;
            box-sizing: border-box;
            border-top-right-radius: 30px;
            border-bottom-right-radius: 30px;
        }
        
        .sidebar .logo {
            font-size: 24px;
            margin-bottom: 30px;
            display: flex;
            align-items: center;
        }
        
        .sidebar .logo::before {
            
            color: #ffd700;
            margin-right: 10px;
            font-size: 28px;
        }
        
        .sidebar a {
            display: flex;
            align-items: center;
            color: white;
            text-decoration: none;
         
            font-size: 14px;
        }
        
        .sidebar a img {
             border-radius: 50%;
            width: 24px;
            height: 24px;
            margin-right: 10px;
        }
        
        .main-content {
            flex: 1;
            padding: 20px 40px;
            background-color: #f0f0f0;

        }
        
        h1 {
            margin-top: 0;
            font-size: 24px;
        }
        
        .dashboard-header {
            margin-bottom: 20px;
        }
        
        .dashboard-header h2 {
            margin-bottom: 5px;
        }
        
        .dashboard-header p {
            color: #888;
            margin-top: 0;
        }
        
        .dashboard-stats {
            display: flex;
            justify-content: space-between;
            margin-bottom: 30px;
        }
        
        .stat-box {
            background-color: white;
            padding: 10px;
            border-radius: 10px;
            width: 30%;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        }
        
        .stat-box h3 {
            margin-top: 0;
            color: #888;
            font-weight: normal;
        }
        
        .stat-box .value {
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 10px;
        }
        
        .chart-placeholder {
            height: 10px;
            background: linear-gradient(to right, #5d5fef, #ff69b4);
            border-radius: 5px;
        }
        
        .messages {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        }
        
        .message {
            display: flex;
            align-items: center;
            margin-bottom: 15px;
        }
        
        .message img {
            width: 40px;
            height: 40px;
            border-radius: 50%;
            margin-right: 15px;
        }
        
        .message-content {
            flex: 1;
        }
        
        .message-status {
            color: #5d5fef;
            margin-right: 10px;
        }
        
        .message-time {
            color: #888;
        }
          
        
       
        
        h1 {
            color: blue;
            justify-content: center;
        }
        
        form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        
        input[type="text"], input[type="email"], textarea {
            width: 300px;
            padding: 10px;
            margin-bottom: 10px;
            border-radius: 5px;
            border: 1px solid gray;
        }
        
        input[type="submit"] {
            background-color: blue;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="container">
        <aside class="sidebar">
             <div class="logo">
                    <img src="one.png" alt="KIMINA"> &nbsp;
                    <span>KIMINA</span>
                </div>
            <nav>
                <a href="ikimina.html"><img src="dashboard.jfif" alt="Dashboard">Dashboard</a><br>
                <a href="guest.html"><img src="guestnew.jfif" alt="Guest">GUEST</a><br>
                <a href="normalstaff.html"><img src="normal.jfif" alt="Normal Staff">NORMAL STAFF</a><br>
                <a href="makingdecision.html"><img src="credit comi.png" alt="Credit Committee">CREDIT COMMITEE</a><br>
                <a href="monitoringstaffcontributions.html"><img src="acc.png" alt="Accountant">ACCOUNTANT</a><br>
                <a href="vicepresidentdashboard.html"><img src="vice.png" alt="Vice President">VICE PRESIDENT</a><br>
                <a href="Presidentdashboard.html"><img src="pres.jfif" alt="President">PRESIDENT</a><br>
                <a href="superadmin.html"><img src="adnew.jfif" alt="Super Admin">SUPER ADMIN</a><br><br><br><br>
                <a href="settings.html"><img src="sett.png" alt="Settings">Settings</a>
                <a href="logout.html"><img src="log out.png" alt="Log out">Log out</a><br>
            </nav>
        </aside>
        
        <main class="main-content">
            <header>
                <h1>FINANCIAL COOPERATIVE AT IPRC KARONGI</h1>
            </header>
  <center>
               <div  style="margin-left:3%;margin-top: 4%;">
                          <form action="JspController/ManagRequestMember.jsp" method="post"> <h1>Request Membership</h1>
                        <input type="text" placeholder="FirstName" name="fname" required>
            <input type="text" placeholder="lastname" name="lname" required>
            <input type="email" placeholder="Email" name="mail" required>
            <input type="text" placeholder="phone" name="fone" required>
            <input type="text" placeholder="Request Date" name="dat" required>
            <textarea placeholder="reason_to_join" name="rea" required></textarea>
                        <input type="submit" value="Submit Request">
            
        </form>
    </div></center>
    </div>
   <footer>
  <div class="footer-bottom" style="text-align: center;background-color: blue; color: white; padding: 5px;">
    <p>&copy; 2024 IKIMINA. All rights reserved.</p>
  </div>
</footer>
</body>
</html>