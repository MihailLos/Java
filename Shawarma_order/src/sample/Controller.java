package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    protected RadioButton rbClassicShwarm;
    @FXML
    protected RadioButton rbHomeShwarm;
    @FXML
    protected RadioButton rbVegeShwarm;
    @FXML
    protected RadioButton rbExtraShwarm;
    @FXML
    protected RadioButton rbCommon;
    @FXML
    protected RadioButton rbCheesy;
    @FXML
    protected RadioButton rbGarlic;
    @FXML
    protected RadioButton rbChili;
    @FXML
    protected TextField tfSausagesQuantity;
    @FXML
    protected TextField tfPineappleQuantity;
    @FXML
    protected TextField tfCheeseQuantity;
    @FXML
    protected TextField tfMeatSauceQuantity;
    @FXML
    protected TextField tfFrenchFriesQuantity;
    @FXML
    protected TextField tfColaQuantity;
    @FXML
    protected TextField tfWaterQuantity;
    @FXML
    protected TextField tfAppleJuiceQuantity;
    @FXML
    protected TextField tfMultifruitJuiceQuantity;
    @FXML
    protected TextArea taSummary;
    @FXML
    protected Button btnOrder;
    @FXML
    protected Button btnCancel;
    @FXML
    protected Button btnAllOrders;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void orderButtonAction() {
        Order shwarm = null;
        Order drink = null;
        String totalOrderLabel = "";
        double totalOrderPrice = 0;
        taSummary.clear();

        if (rbClassicShwarm.isSelected()) {
            shwarm = new Shawarma("Классическая шаурма", 150);
        } else if (rbHomeShwarm.isSelected()) {
            shwarm = new Shawarma("Домашняя шаурма", 165);
        } else if (rbVegeShwarm.isSelected()) {
            shwarm = new Shawarma("Вегетарианская шаурма", 130);
        } else if (rbExtraShwarm.isSelected()) {
            shwarm = new Shawarma("Шаурма 'Экстра'", 200);
        }

        if (rbCommon.isSelected()) {
            shwarm = new NoCostExtra("Обычный соус", 0, shwarm);
        } else if (rbCheesy.isSelected()) {
            shwarm = new NoCostExtra("Сырный соус", 0, shwarm);
        } else if (rbGarlic.isSelected()) {
            shwarm = new NoCostExtra("Чесночный соус", 0, shwarm);
        } else if (rbChili.isSelected()) {
            shwarm = new NoCostExtra("Соус чили", 0, shwarm);
        }

        if (!tfSausagesQuantity.getText().trim().isEmpty()) {
            int sausagesQuantity = Integer.parseInt(tfSausagesQuantity.getText());
            shwarm = new CostExtra("Охотничьи колбаски x" + tfSausagesQuantity.getText(), 50*sausagesQuantity, shwarm);
        } if (!tfPineappleQuantity.getText().trim().isEmpty()) {
            int pineappleQuantity = Integer.parseInt(tfPineappleQuantity.getText());
            shwarm = new CostExtra("Ананас x" + tfPineappleQuantity.getText(), 35*pineappleQuantity, shwarm);
        } if (!tfCheeseQuantity.getText().trim().isEmpty()) {
            int cheeseQuantity = Integer.parseInt(tfCheeseQuantity.getText());
            shwarm = new CostExtra("Сыр x" + tfCheeseQuantity.getText(), 15*cheeseQuantity, shwarm);
        } if (!tfMeatSauceQuantity.getText().trim().isEmpty()) {
            int meatSauceQuantity = Integer.parseInt(tfMeatSauceQuantity.getText());
            shwarm = new CostExtra("Мясная подливка x" + tfMeatSauceQuantity.getText(), 25*meatSauceQuantity, shwarm);
        } if (!tfFrenchFriesQuantity.getText().trim().isEmpty()) {
            int frenchFriesQuantity = Integer.parseInt(tfFrenchFriesQuantity.getText());
            shwarm = new CostExtra("Картофель фри x" + tfFrenchFriesQuantity.getText(), 20*frenchFriesQuantity, shwarm);
        }

        if (!tfColaQuantity.getText().trim().isEmpty()) {
            int colaQuantity = Integer.parseInt(tfColaQuantity.getText());
            drink = new Drink("Кола x" + tfColaQuantity.getText(), 70*colaQuantity);
        } else if (!tfWaterQuantity.getText().trim().isEmpty()) {
            int waterQuantity = Integer.parseInt(tfWaterQuantity.getText());
            drink = new Drink("Вода x" + tfWaterQuantity.getText(), 20*waterQuantity);
        } else if (!tfAppleJuiceQuantity.getText().trim().isEmpty()) {
            int appleJuiceQuantity = Integer.parseInt(tfAppleJuiceQuantity.getText());
            drink = new Drink("Сок яблочный x" + tfAppleJuiceQuantity.getText(), 40*appleJuiceQuantity);
        } else if (!tfMultifruitJuiceQuantity.getText().trim().isEmpty()) {
            int multifruitJuiceQuantity = Integer.parseInt(tfMultifruitJuiceQuantity.getText());
            shwarm = new Drink("Сок мультифрукт x" + tfMultifruitJuiceQuantity.getText(), 50*multifruitJuiceQuantity);
        }

        if (shwarm == null && drink == null) {
            taSummary.appendText("Сделайте свой заказ! Хотя-бы шаурму или напиток." + "\n");
        }
        else {
            if (shwarm != null) {
                taSummary.appendText("*******************************************" + "\n");
                taSummary.appendText("Заказ шаурмы: " + shwarm.getLabel() + "\n");
                taSummary.appendText("Стоимость шаурмы: " + shwarm.getPrice() + "\n");
                taSummary.appendText("*******************************************" + "\n");
                totalOrderLabel += shwarm.getLabel() + " ";
                totalOrderPrice += shwarm.getPrice();
            }
            if (drink != null) {
                taSummary.appendText("*******************************************" + "\n");
                taSummary.appendText("Заказ напитка: " + drink.getLabel() + "\n");
                taSummary.appendText("Стоимость напитка: " + drink.getPrice() + "\n");
                taSummary.appendText("*******************************************" + "\n");
                totalOrderLabel += drink.getLabel() + " ";
                totalOrderPrice += drink.getPrice();
            }
            DataBaseConnect insertData = new DataBaseConnect();
            insertData.insert(totalOrderLabel, totalOrderPrice);
        }
    }

    @FXML
    public void cancelButtonAction(ActionEvent event) {
        rbClassicShwarm.setSelected(false);
        rbExtraShwarm.setSelected(false);
        rbVegeShwarm.setSelected(false);
        rbHomeShwarm.setSelected(false);
        rbCommon.setSelected(false);
        rbCheesy.setSelected(false);
        rbGarlic.setSelected(false);
        rbChili.setSelected(false);
        tfSausagesQuantity.setText("");
        tfPineappleQuantity.setText("");
        tfCheeseQuantity.setText("");
        tfMeatSauceQuantity.setText("");
        tfFrenchFriesQuantity.setText("");
        tfColaQuantity.setText("");
        tfWaterQuantity.setText("");
        tfAppleJuiceQuantity.setText("");
        tfMultifruitJuiceQuantity.setText("");
        taSummary.clear();
    }

    @FXML
    public void AllOrdersButtonAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ord_table.fxml"));
        Scene scene = new Scene(root);
        Stage newWindow = new Stage();

        newWindow.setTitle("Shop 'Shawarma from Loos'");
        newWindow.setScene(scene);
        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.show();
    }
}
