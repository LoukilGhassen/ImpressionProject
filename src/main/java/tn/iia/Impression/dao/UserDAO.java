package tn.iia.Impression.dao;

import tn.iia.Impression.model.RoleUser;
import tn.iia.Impression.model.StatutCompteUser;
import tn.iia.Impression.model.Utilisateur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public void AddUser(Utilisateur user) {
        String query = "INSERT INTO `utilisateurs` (`nom`, `prenom`, `login`, `password`, `statut`, `role`) VALUES ('"+user.getNom()+"', '"+
                user.getPrenom()+"', '"+user.getLogin()+"', '"+user.getPassword()+"', '"+user.getStatut()+"', '"+user.getRole()+"')";
        try {
            Statement statement = connexionDB.getConnectionStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public Utilisateur findById(int id) {
        String query = "SELECT * FROM utilisateurs  WHERE `id` = " + id ;
        try {
            Statement statement = connexionDB.getConnectionStatement();
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                Utilisateur newUser=new Utilisateur();
                newUser.setId(rs.getInt(1));
                newUser.setNom(rs.getString(2));
                newUser.setPrenom(rs.getString(3));
                newUser.setLogin(rs.getString(4));
                newUser.setPassword(rs.getString(5));
                newUser.setStatut(StatutCompteUser.valueOf(rs.getString(6)));
                newUser.setRole(RoleUser.valueOf(rs.getString(7)));

                return newUser;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public Utilisateur findByLoginMp(String login, String password) {
        String query = "SELECT * FROM utilisateurs  WHERE `login` = '" + login + "' AND `password` = '" + password + "'";
        try {
            Statement statement = connexionDB.getConnectionStatement();
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                Utilisateur newUser=new Utilisateur();
                newUser.setId(rs.getInt(1));
                newUser.setNom(rs.getString(2));
                newUser.setPrenom(rs.getString(3));
                newUser.setLogin(rs.getString(4));
                newUser.setPassword(rs.getString(5));
                newUser.setStatut(StatutCompteUser.valueOf(rs.getString(6)));
                newUser.setRole(RoleUser.valueOf(rs.getString(7)));

                return newUser;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public void UpdateStatus(Utilisateur user,StatutCompteUser statut) {
        String query = "UPDATE `utilisateurs` SET `statut` = '"+statut.toString()+"' WHERE `utilisateurs`.`id` = "+user.getId()+";";
        try {
            Statement statement = connexionDB.getConnectionStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Utilisateur> findAll() {
        List<Utilisateur> list = new ArrayList<>();
        String query = "SELECT * FROM `utilisateurs`";
        try {
            Statement statement = connexionDB.getConnectionStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
               Utilisateur newUser=new Utilisateur();
               newUser.setId(rs.getInt(1));
               newUser.setNom(rs.getString(2));
               newUser.setPrenom(rs.getString(3));
               newUser.setLogin(rs.getString(4));
               newUser.setPassword(rs.getString(5));
                newUser.setStatut(StatutCompteUser.valueOf(rs.getString(6)));
               newUser.setRole(RoleUser.valueOf(rs.getString(7)));

               list.add(newUser);
            }
            return  list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
