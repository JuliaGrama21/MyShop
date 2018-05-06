package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    public static Connection connection = null;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Неможливо знайти драйвер");
        }

        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/shop","postgres", "postgres");
            System.out.println("ПІДКЛЮЧЕННЯ ВСТАНОВЛЕНО");
        } catch (SQLException e) {
            System.out.println("Помилка підключення до бази");
        }

    }

    public static Connection getConnection() {
        return connection;
    }

}
