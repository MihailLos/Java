package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseConnect {
    public Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:/SQLiteStudio-3.2.1/SQLiteStudio/data_base";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url);
            System.out.println("Successful connection");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public void insert(String order_label, double order_price) {
        String sql = "INSERT INTO orders(order_label, order_price) VALUES(?, ?)";

        try (Connection con = this.connect();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, order_label);
            pstmt.setDouble(2, order_price);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
