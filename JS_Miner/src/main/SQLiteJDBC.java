package main;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author hc-kr.com
 */
public class SQLiteJDBC {
Connection conn = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConnectDB();
    }
    public static Connection ConnectDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:crud.s3db");
            JOptionPane.showMessageDialog(null,"Connection Success!");
            return conn;
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Connection failed ! " + e);
            return null;
        }
    }
}