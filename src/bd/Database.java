package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/biblio";
    private static final String USER = "root";
    private static final String PASS = "";

    private Connection conn;
    private Statement stmt;

    public Database() throws SQLException {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
    }

    // SELECT
    public ResultSet select(String sql) throws SQLException {
        return stmt.executeQuery(sql);
    }

    // INSERT / UPDATE / DELETE
    public int update(String sql) throws SQLException {
        return stmt.executeUpdate(sql);
    }

    

  
}
