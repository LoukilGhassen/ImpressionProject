package tn.iia.Impression.controller;

import tn.iia.Impression.dao.UserDAO;
import tn.iia.Impression.model.StatutCompteUser;
import tn.iia.Impression.model.Utilisateur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/user/modification")
public class ModifierCompteServlet extends HttpServlet {

    UserDAO service=new UserDAO();
    public ModifierCompteServlet() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        StatutCompteUser statut;
        Utilisateur user=service.findById(Integer.parseInt(request.getParameter("id")));
        if (user.getStatut()== StatutCompteUser.Activer){
           statut=StatutCompteUser.Desactiver;
        }else {
            statut=StatutCompteUser.Activer;
        }
        service.UpdateStatus(user,statut);
    }
}
