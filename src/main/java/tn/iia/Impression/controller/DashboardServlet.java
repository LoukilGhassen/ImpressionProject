package tn.iia.Impression.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dashboard")
public class DashboardServlet  extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException, ServletException {


        // Récupérez le RequestDispatcher pour la page JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("dashboardPage.jsp");

        // Transférer le contrôle à la page JSP
        dispatcher.forward(request, response);
    }

}
