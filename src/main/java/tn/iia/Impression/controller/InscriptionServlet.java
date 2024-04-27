package tn.iia.Impression.controller;

import tn.iia.Impression.dao.UserDAO;
import tn.iia.Impression.model.RoleUser;
import tn.iia.Impression.model.Utilisateur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user/inscription")
public class InscriptionServlet  extends HttpServlet {
    UserDAO service=new UserDAO();

    public InscriptionServlet() {
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Récupérer les paramètres du formulaire
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        // Vérifier si les champs ne sont pas vides
        if(!nom.isEmpty() && !prenom.isEmpty() && !login.isEmpty() &&!password.isEmpty() && !role.isEmpty()) {
            Utilisateur newUser=new Utilisateur(nom,prenom,login,password, RoleUser.valueOf(role));
            service.AddUser(newUser);
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head><title>Réussi !</title></head><body>");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Nouvel utilisateur ajouté avec succès!');");
            out.println("</script>");
            out.println("</body></html>");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head><title>Echec !</title></head><body>");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Erreur lors de l'ajout de l'utilisateur!');");
            out.println("</script>");
            out.println("</body></html>");
        }
    }

}
