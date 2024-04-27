package tn.iia.Impression.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connexionDB {
        // Paramètres de connexion à la base de données
        private static final String URL = "jdbc:mysql://localhost:3306/impressiondb";
        private static final String USER = "root";
        private static final String PASSWORD = "root";


    public static Statement getConnectionStatement() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        return conn.createStatement();

    }


}
