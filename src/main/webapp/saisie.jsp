<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculatrice</title>
  </head>
  <body>
       <h1>Calculatrice</h1>
        <form action="Calcul" method="get">
               <label for="operande1">Operande 1 :</label>
               <input type="text" id="operande1" name="operande1" required>
               <br><br>
               <label for="operande2">Operande 2 :</label>
               <input type="text" id="operande2" name="operande2" required>
               <br><br>
               <label for="operation">Operation :</label>
               <select id="operation" name="operation">
                   <option value="+">Addition</option>
                   <option value="-">Soustraction</option>
                   <option value="*">Multiplication</option>
                   <option value="/">Division</option>
               </select>
               <br><br>
               <button type="submit">Calculer</button>
           </form>

  </body>
</html>
