<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Resultat</title>
  </head>
  <body>
        <h1>Résultat</h1>
        <p>
            <%
                // Récupération des attributs de l'objet request
                Integer operande1Obj = (Integer) request.getAttribute("operande1");
                Integer operande2Obj = (Integer) request.getAttribute("operande2");
                String operation = (String) request.getAttribute("operation");
                Integer resultatObj = (Integer) request.getAttribute("resultat");

                // Vérification des nulls (sécurité)
                if (operande1Obj != null && operande2Obj != null && resultatObj != null) {
                    int operande1 = operande1Obj;
                    int operande2 = operande2Obj;
                    int resultat = resultatObj;

                    // Affichage du résultat
            %>
                    <%= operande1 %> <%= operation %> <%= operande2 %> = <%= resultat %>
            <%
                } else {
            %>
                    <p style="color:red;">Erreur : Une ou plusieurs valeurs sont manquantes.</p>
            <%
                }
            %>
        </p>
        <br>
        <a href="saisie.jsp">Revenir à la page de saisie</a>
  </body>
</html>
