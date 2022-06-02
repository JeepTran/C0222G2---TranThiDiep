package repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private String jdbcURL = "jdbc:mysql://localhost:3306/ss12_user_management";
    private String username = "root";
    private String password = "diep1005";
    private Connection connection;

    public BaseRepository() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            this.connection = DriverManager.getConnection(jdbcURL,username,password);
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
    }

    public Connection getConnectionJavaToDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcURL, username, password);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
