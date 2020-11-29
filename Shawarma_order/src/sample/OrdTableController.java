package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.xml.crypto.Data;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrdTableController implements Initializable {
    @FXML
    private TableView<ModelTable> ord_table;
    @FXML
    private TableColumn<ModelTable, Integer> col_id;
    @FXML
    private TableColumn<ModelTable, String> col_order_label;
    @FXML
    private TableColumn<ModelTable, Double> col_order_price;

    ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
    @Override
    public void initialize (URL location, ResourceBundle rb) {
        try {
            Connection con = DataBaseConnect.connect();
            ResultSet rs = con.createStatement().executeQuery("select * from orders");

            while(rs.next()) {
                oblist.add(new ModelTable(rs.getInt("id"), rs.getString("order_label"), rs.getDouble("order_price")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrdTableController.class.getName()).log(Level.SEVERE, null, ex);
        }

        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_order_label.setCellValueFactory(new PropertyValueFactory<>("order_label"));
        col_order_price.setCellValueFactory(new PropertyValueFactory<>("order_price"));

        ord_table.setItems(oblist);
    }
}
