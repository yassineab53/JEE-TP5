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
        String operande1_str = request.getParameter("operande1");
        String operande2_str = request.getParameter("operande2");
        String operation = request.getParameter("operation");


        try {
            if (operande1_str == null || operande2_str == null || operande1_str.isEmpty() || operande2_str.isEmpty()) {
                request.setAttribute("message", "Les deux operandes sont obligatoires.");
                request.getRequestDispatcher("saisie.jsp").forward(request, response);
                return;
            }
            int operande1 = Integer.parseInt(operande1_str);
            int operande2 = Integer.parseInt(operande2_str);
            int resultat;
            switch (operation) {
                case "+":
                    resultat = operande1 + operande2;
                    break;
                case "-":
                    resultat = operande1 - operande2;
                    break;
                case "*":
                    resultat = operande1 * operande2;
                    break;
                case "/":
                    if (operande2 == 0) {
                        request.setAttribute("message", "Division par zero impossible.");
                        request.getRequestDispatcher("saisie.jsp").forward(request, response);
                        return;
                    }
                    resultat = operande1 / operande2;
                    break;
                default:
                    request.setAttribute("message", "Operation invalide.");
                    request.getRequestDispatcher("saisie.jsp").forward(request, response);
                    return;
            }
        }catch (NumberFormatException e){
            request.setAttribute("message", "Veuillez saisir des nombres valides.");
            request.getRequestDispatcher("saisie.jsp").forward(request, response);
        }
    }
}
