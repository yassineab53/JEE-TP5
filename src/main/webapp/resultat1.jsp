<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Resultat</title>
  </head>
  <body>
        <h1>Resultat</h1>
        <p>
                <%    int operande1 = (int) request.getAttribute("operande1"); %>
                <%    int operande2 = (int) request.getAttribute("operande2"); %>
                <%    String operation = (String) request.getAttribute("operation"); %>
                <%    int resultat = (int) request.getAttribute("resultat"); %>

                <%= operande1 %> <%= operation %> <%= operande2 %> = <%= resultat %>
        </p>
            <br>
                <a href="saisie.jsp">Revenir a la page de saisie</a>
  </body>
</html>