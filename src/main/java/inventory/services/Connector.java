package inventory.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private Connection connection;

    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/inventory";
        String username = "DSA";
        String password = "DSA@ksarp123";

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void disconnect(Connection connection){
        try {
            connection.close();
            System.out.println("Disconnected from the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
