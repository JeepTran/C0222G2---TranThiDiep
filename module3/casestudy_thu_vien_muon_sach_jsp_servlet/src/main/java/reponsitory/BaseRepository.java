package reponsitory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private final String jdbcURL="jdbc:mysql://localhost:3306/library_jsp_servlet";
    private final String username="root";
    private final String password="diep1005";
    private Connection connection;

    public BaseRepository() {
    }
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcURL,username,password);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
