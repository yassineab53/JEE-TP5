package net.yassine.tp5;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/Test")
public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("operande1", 5);
        request.setAttribute("operande2", 10);
        request.setAttribute("operation", "+");
        request.setAttribute("resultat", 15);
        request.getRequestDispatcher("resultat.jsp").forward(request, response);
    }
}
