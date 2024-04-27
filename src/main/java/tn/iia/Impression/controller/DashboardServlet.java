package tn.iia.Impression.controller;

import tn.iia.Impression.dao.UserDAO;
import tn.iia.Impression.model.Utilisateur;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/dashboard")
public class DashboardServlet  extends HttpServlet {
    UserDAO service=new UserDAO();
    List<Utilisateur> listeUtaleurs=new ArrayList<>();

    public DashboardServlet() {
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException, ServletException {
        listeUtaleurs=service.findAll();

        // Récupérez le RequestDispatcher pour la page JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("dashboardPage.jsp");
        // Transférer le contrôle à la page JSP
        dispatcher.forward(request, response);
    }


}
