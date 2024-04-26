package tn.iia.Impression.dao;

import tn.iia.Impression.model.RoleUser;
import tn.iia.Impression.model.StatutCompteUser;
import tn.iia.Impression.model.Utilisateur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
/*
    public boolean CreateUser(Utilisateur obj) {
        boolean test;
        try {
            PreparedStatement ps = connexion.prepareStatement(
                    "insert into utilisateur (`nom`, `prenom`,`statut`, `role`,  `login`, `password`) values (?,?,?,?,?,?,?,?)");

            ps.setString(1, obj.getNom());
            ps.setString(2, obj.getPrenom());
            ps.setString(7,obj.getRole().toString());
            ps.setString(8,obj.getPassword());
            ps.executeUpdate();
            ps.close();
            test=true;
        } catch (SQLException e1) {

            test=false;
        }
        return test;
    }

    public Utilisateur getById(int id) {
        Utilisateur user = new Utilisateur();
        try {
            PreparedStatement ps = connexion.prepareStatement("select * from utilisateurs where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user.setNom(rs.getString(1));
                user.setPrenom(rs.getString(2));

                user.setRole(RoleUser.valueOf(rs.getString(7)));
                user.setPassword(rs.getString(8));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public List<Utilisateur> getAll() {
        List<Utilisateur> listeUtilisateur = new ArrayList<>();
        try {
            PreparedStatement ps = connexion.prepareStatement("select * from utilisateurs");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Utilisateur user = new Utilisateur();

                user.setNom(rs.getString(1));
                user.setPrenom(rs.getString(2));

                user.setRole(RoleUser.valueOf(rs.getString(7)));

                listeUtilisateur.add(user);

            }
        } catch (SQLException e) {
            return null;
        }
        return listeUtilisateur;
    }

    public boolean DisableUser(Utilisateur obj) {
        boolean test;
        try {
            PreparedStatement ps = connexion.prepareStatement(
                    "update utilisateurs set statut="+ StatutCompteUser.Desactiver.toString()+" where id=?");
            ps.setInt(1, obj.getId());

            ps.executeUpdate();
            ps.close();
            test=true;
        } catch (SQLException e1) {
            e1.printStackTrace();
            test=false;
        }
        return test;
    }

*/
}
