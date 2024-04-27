package tn.iia.Impression.controller;

import tn.iia.Impression.dao.UserDAO;
import tn.iia.Impression.model.Utilisateur;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Login",urlPatterns={"/login"})
public class LoginServlet extends HttpServlet {
    UserDAO service=new UserDAO();

    public LoginServlet() {
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Récupérer les paramètres du formulaire (nom d'utilisateur et mot de passe)
        String login = request.getParameter("username");
        String password = request.getParameter("password");

        // vérifier si les champs ne sont pas vides
        if(!login.isEmpty() && !password.isEmpty()) {
            Utilisateur userConnect=new Utilisateur();
            userConnect=service.findByLoginMp(login,password);
            if(userConnect!=null){
                    switch (userConnect.getRole()) {
                        case Admin:
                            // Obtenir le contexte du chemin de votre application
                            String contextPath = request.getContextPath();
                            // Redirection vers la nouvelle page JSP
                            response.sendRedirect(contextPath + "/dashboardPage.jsp");
                            break;
                        case Agent:
                            break;
                        case Enseignant:
                            break;
                    }
            }else {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<html><head><title>Echec !</title></head><body>");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Utilisateur non trouvé!');");
                out.println("</script>");
                out.println("</body></html>");
            }
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head><title>Vide !</title></head><body>");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Remplir les champs !');");
            out.println("</script>");
            out.println("</body></html>");
        }
    }

}