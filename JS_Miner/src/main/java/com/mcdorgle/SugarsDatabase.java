package com.mcdorgle;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SugarsDatabase {
    private Connection conn = null;

    public SugarsDatabase() {
        conn = ConnectDB();
        createDatabase();
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            // Ignore any exceptions while closing
        }
    }
    
    public Integer getRatio() {
        Integer ratio = 0;
        try(Statement statement = conn.createStatement()) {
            String sql = "SELECT value from Settings WHERE name='ratio'";
            ResultSet results = statement.executeQuery(sql);
            if (results.next()) {
                ratio = results.getInt("value");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to get ratio: " + e);
        }
        return ratio;
    }
    
    public void setRatio(Integer ratio) {
        try(Statement statement = conn.createStatement()) {
            String sql = String.format("INSERT OR REPLACE INTO Settings (rowid, name, value) values ((SELECT rowid FROM Settings WHERE name='ratio'), 'ratio', %d)", ratio);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to set ratio: " + e);
        }
    }
    
    public void addSugars(Sugars sugars) {
        try(Statement statement = conn.createStatement()) {
            String sql = String.format("INSERT INTO Sugars (sugar, carbs, insulin, datetime) values (%d, %d, %d, '%s')",
                    sugars.getSugar(),
                    sugars.getCarbs(),
                    sugars.getInsulin(),
                    sugars.getDatetime().toString());
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to add sugars to the database: " + e);
        }
    }
    
    public List<Sugars> getSugars() {
        List<Sugars> sugarsList = new ArrayList();
        
        try(Statement statement = conn.createStatement()) {
            String sql = "SELECT * FROM Sugars order by datetime desc";
            ResultSet results = statement.executeQuery(sql);
            while (results.next()) {
                Sugars sugars = new Sugars();
                sugars.setSugar(results.getInt("sugar"));
                sugars.setCarbs(results.getInt("carbs"));
                sugars.setInsulin(results.getInt("insulin"));
                sugars.setDatetime(LocalDateTime.parse(results.getString("datetime")));
                sugarsList.add(sugars);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to get sugars: " + e);
        }
        return sugarsList;
    }
    
    private void createDatabase() {
        createSettingsTable();
        createSugarsTable();
    }

    private void createSugarsTable() {
        try(Statement statement = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS Sugars (sugar INT, carbs INT, insulin INT, datetime STRING)";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to create sugars table: " + e);
        }
    }

    private void createSettingsTable() {
        try {
            DatabaseMetaData metadata = conn.getMetaData();
            ResultSet results = metadata.getTables(null, null, "Settings", new String[] {"TABLE"});
            
            if(!results.next()) { // No Settings table exists
                Statement statement = conn.createStatement();
                String sql = "CREATE TABLE Settings (name TEXT, value TEXT)";
                statement.executeUpdate(sql);
                sql = "INSERT INTO Settings (name, value) values ('ratio', '1')";
                statement.executeUpdate(sql);
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to create settings table: " + e);
        }        
    }

    public static Connection ConnectDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:SugarDB.sqlite");
            return conn;
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Connection failed! " + e);
            return null;
        }
    }
}
