<%--
  Created by IntelliJ IDEA.
  User: marywhite
  Date: 12/3/21
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

</head>
<body>


<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h1>${ad.title}</h1>
        <p>${ad.description}</p>

    </div>
</c:forEach>

</body>
</html>