package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button btnOrder;
    @FXML
    private Button btnCancel;
    @FXML
    private RadioButton rbClassicShwarm;
    @FXML
    private RadioButton rbHomeShwarm;
    @FXML
    private RadioButton rbVegeShwarm;
    @FXML
    private RadioButton rbExtraShwarm;
    @FXML
    private javafx.scene.control.TextArea taSummary;
    @FXML
    private TextField tfQuantity;
    @FXML
    private ChoiceBox<String> cbShwarmSize;
    private final String[] sizeItems = {"Маленькая (220 гр.)", "Средняя (350 гр.)", "Большая (450 гр.)"};
    private final ObservableList<String> sizeList = FXCollections.observableArrayList(sizeItems);

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbShwarmSize.setItems(sizeList);
    }

    @FXML
    public void orderButtonAction(ActionEvent event) {
        double price;
        int quantity = Integer.parseInt(tfQuantity.getText());
        String size = cbShwarmSize.getSelectionModel().getSelectedItem();
        Shawarma shwarm = new Shawarma();
        if (rbClassicShwarm.isSelected()) {
            shwarm.setType(1); // 1 - классическая, 2 - домашняя, 3 - вегетарианская, 4 - экстра
            shwarm.setSize(cbShwarmSize.getSelectionModel().getSelectedIndex()); // 0 - маленькая, 1 - средняя, 2 - большая
            shwarm.setPrice(150);
            taSummary.appendText(rbClassicShwarm.getText() + ", " + shwarm.getPrice() + " руб., " + shwarm.getSize() + ", " + quantity + " шт." + "\n");
        } else if (rbHomeShwarm.isSelected()) {
            shwarm.setType(2); // 1 - классическая, 2 - домашняя, 3 - вегетарианская, 4 - экстра
            shwarm.setSize(cbShwarmSize.getSelectionModel().getSelectedIndex()); // 0 - маленькая, 1 - средняя, 2 - большая
            shwarm.setPrice(165);
            taSummary.appendText(rbHomeShwarm.getText() + ", " + shwarm.getPrice() + " руб., " + shwarm.getSize() + ", " + quantity + " шт." + "\n");
        } else if (rbVegeShwarm.isSelected()) {
            shwarm.setType(3); // 1 - классическая, 2 - домашняя, 3 - вегетарианская, 4 - экстра
            shwarm.setSize(cbShwarmSize.getSelectionModel().getSelectedIndex()); // 0 - маленькая, 1 - средняя, 2 - большая
            shwarm.setPrice(130);
            taSummary.appendText(rbVegeShwarm.getText() + ", " + shwarm.getPrice() + " руб., " + shwarm.getSize() + ", " + quantity + " шт." + "\n");
        } else if (rbExtraShwarm.isSelected()) {
            shwarm.setType(4); // 1 - классическая, 2 - домашняя, 3 - вегетарианская, 4 - экстра
            shwarm.setSize(cbShwarmSize.getSelectionModel().getSelectedIndex()); // 0 - маленькая, 1 - средняя, 2 - большая
            shwarm.setPrice(200);
            taSummary.appendText(rbExtraShwarm.getText() + ", " + shwarm.getPrice() + " руб., " + shwarm.getSize() + ", " + quantity + " шт." + "\n");
        }
    }

    @FXML
    public void cancelButtonAction(ActionEvent event) {
        rbClassicShwarm.setSelected(false);
        rbExtraShwarm.setSelected(false);
        rbVegeShwarm.setSelected(false);
        rbHomeShwarm.setSelected(false);
        tfQuantity.setText(null);
        cbShwarmSize.setValue(null);
    }
}