<%--
  Created by IntelliJ IDEA.
  User: rhiannonhayes
  Date: 11/30/21
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>

<% counter += 1;

    request.setAttribute("NumberOfVisits", counter);

%>

<% if(request.getParameter("reset") != null && request.getParameter("reset").equals("true")) {
    counter = 0;
}
%>


<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>The current count is ${NumberOfVisits}.</h1>
<p>resetting counter: ${param.reset}</p>



<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

</body>
</html>