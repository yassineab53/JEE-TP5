<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="net.yassine.tp5.Identification" %>
<html>
  <head>
    <title>Tp5-Exercice1</title>
  </head>
  <body>
        <% String login = (String)request.getAttribute("login"); %>
        Bonjour <%= login %>
  </body>
</html>
