package net.yassine.tp5;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/Identification")
public class Identification extends HttpServlet {
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          String login = request.getParameter("login");
          RequestDispatcher rd = request.getRequestDispatcher("accueil.jsp");
          request.setAttribute("login",login);
          rd.forward(request,response);
      }
}
