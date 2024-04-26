package tn.iia.Impression.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Inscription")
public class InscriptionServlet  extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Récupérer les paramètres du formulaire (nom d'utilisateur et mot de passe)
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Vous pouvez implémenter ici la logique d'authentification
        // Par exemple, vérifier les informations d'identification dans une base de données

        // Pour l'exemple, vérifions simplement si les champs ne sont pas vides
        if(username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
            // Authentification réussie, redirigez vers une page de succès

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head><title>Popup</title></head>");
            out.println("<body>");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Ceci est une popup !');");
            out.println("</script>");
            out.println("<h2>Contenu de la page</h2>");
            out.println("<p>Autre contenu de la page...</p>");
            out.println("</body>");
            out.println("</html>");
            // response.sendRedirect("success.jsp");
        } else {
            // Authentification échouée, redirigez vers une page d'échec
            //  response.sendRedirect("failure.jsp");
        }
    }

}
