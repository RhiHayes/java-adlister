<%--
  Created by IntelliJ IDEA.
  User: rhiannonhayes
  Date: 11/30/21
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! int visits = 0; %>
<%
    if(visits == 0) {
        request.setAttribute("hasUserBeenHere", false);
    }   else {
        request.setAttribute("hasUserBeenHere", true);
    }

    visits++;

%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>

<%@ include file="partials/navbar.jsp"%>


<c:choose>
    <c:when test="${hasUserBeenHere}">
        <h2>Welcome back!</h2>
    </c:when>
    <c:otherwise>
        <h2>Welcome!</h2>
    </c:otherwise>
</c:choose>



<%@ include file="partials/scripts.jsp"%>
</body>
</html>
