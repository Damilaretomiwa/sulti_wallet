package repositories;

import exception.DatabaseConnectionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    public static Connection connect(String databaseUsername, String databasePassword) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost3306/bright_wallet", databaseUsername, databasePassword);
            return connection;
        }catch (SQLException exception){
            System.err.println("Error:: " + exception.getMessage());
            throw new DatabaseConnectionException(exception.getMessage());
        }


    }
}
