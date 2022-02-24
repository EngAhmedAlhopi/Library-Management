package finalexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {

    static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    static final String username = "library";
    static final String password = "l123";
    static Connection conn = null;
    
    public static Connection connDB() throws ClassNotFoundException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        return conn;
    }

}
