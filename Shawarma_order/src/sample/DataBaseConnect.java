package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseConnect {
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:C:/SQLiteStudio-3.2.1/SQLiteStudio/data_base");
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
