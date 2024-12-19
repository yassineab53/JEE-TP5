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
      protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
          String login = req.getParameter("login");
          String password = req.getParameter("password");

          if("admin".equals(login) && "admin".equals(password)) {
              RequestDispatcher rd = req.getRequestDispatcher("success.html");
              rd.forward(req,res);
          }else{
              RequestDispatcher rd = req.getRequestDispatcher("error.html");
              rd.forward(req,res);
          }
      }
}
