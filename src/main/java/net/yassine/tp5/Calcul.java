package net.yassine.tp5;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/Calcul")
public class Calcul extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int operande1 = Integer.parseInt(request.getParameter("operande1"));
        int operande2 = Integer.parseInt(request.getParameter("operande2"));
        String operation = request.getParameter("operation");
        int resultat = 0;

        switch (operation) {
            case "+": resultat = operande1 + operande2; break;
            case "-": resultat = operande1 - operande2; break;
            case "*": resultat = operande1 * operande2; break;
            case "/": resultat = operande2 != 0 ? operande1 / operande2 : 0; break;
        }

        request.setAttribute("operande1", operande1);
        request.setAttribute("operande2", operande2);
        request.setAttribute("operation", operation);
        request.setAttribute("resultat", resultat);

        request.getRequestDispatcher("resultat.jsp").forward(request, response);
    }
}