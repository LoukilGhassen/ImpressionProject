package tn.iia.Impression.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connexionDB {
        // Paramètres de connexion à la base de données
        private static final String URL = "jdbc:mysql://localhost:3306/impressiondb";
        private static final String USER = "root";
        private static final String PASSWORD = "root";

        public static Connection getConnection() throws SQLException {
            Connection connection = null;
            try {
                // Charger le pilote JDBC
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Établir la connexion à la base de données
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connexion à la base de données réussie.");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
            }
            return connection;
        }

}
