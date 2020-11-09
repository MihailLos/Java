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
    protected RadioButton rbSausages;
    @FXML
    protected RadioButton rbPineapple;
    @FXML
    protected RadioButton rbCheese;
    @FXML
    protected RadioButton rbMeatSauce;
    @FXML
    protected RadioButton rbFrenchFries;
    @FXML
    protected RadioButton rbCola;
    @FXML
    protected RadioButton rbWater;
    @FXML
    protected RadioButton rbAppleJuice;
    @FXML
    protected RadioButton rbMultifruitJuice;
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
    protected TextField tfDrinkQuantity;
    @FXML
    protected TextArea taSummary;

    @FXML
    protected Button btnOrder;
    @FXML
    protected Button btnCancel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void orderButtonAction() {
        Order shwarm = null;

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

        if (rbSausages.isSelected()) {
            int sausagesQuantity = Integer.parseInt(tfSausagesQuantity.getText());
            shwarm = new CostExtra("Охотничьи колбаски x" + tfSausagesQuantity.getText(), 50*sausagesQuantity, shwarm);
        } if (rbPineapple.isSelected()) {
            int pineappleQuantity = Integer.parseInt(tfPineappleQuantity.getText());
            shwarm = new CostExtra("Ананас x" + tfPineappleQuantity.getText(), 35*pineappleQuantity, shwarm);
        } if (rbCheese.isSelected()) {
            int cheeseQuantity = Integer.parseInt(tfCheeseQuantity.getText());
            shwarm = new CostExtra("Сыр x" + tfCheeseQuantity.getText(), 15*cheeseQuantity, shwarm);
        } if (rbMeatSauce.isSelected()) {
            int meatSauceQuantity = Integer.parseInt(tfMeatSauceQuantity.getText());
            shwarm = new CostExtra("Мясная подливка x" + tfMeatSauceQuantity.getText(), 25*meatSauceQuantity, shwarm);
        } if (rbFrenchFries.isSelected()) {
            int frenchFriesQuantity = Integer.parseInt(tfFrenchFriesQuantity.getText());
            shwarm = new CostExtra("Картофель фри x" + tfFrenchFriesQuantity.getText(), 20*frenchFriesQuantity, shwarm);
        }

        if (rbCola.isSelected()) {
            int drinkQuantity = Integer.parseInt(tfDrinkQuantity.getText());
            shwarm = new Drinks("Кола x" + tfDrinkQuantity.getText(), 70*drinkQuantity, shwarm);
        } else if (rbWater.isSelected()) {
            int drinkQuantity = Integer.parseInt(tfDrinkQuantity.getText());
            shwarm = new Drinks("Вода x" + tfDrinkQuantity.getText(), 20*drinkQuantity, shwarm);
        } else if (rbAppleJuice.isSelected()) {
            int drinkQuantity = Integer.parseInt(tfDrinkQuantity.getText());
            shwarm = new Drinks("Сок яблочный x" + tfDrinkQuantity.getText(), 40*drinkQuantity, shwarm);
        } else if (rbMultifruitJuice.isSelected()) {
            int drinkQuantity = Integer.parseInt(tfDrinkQuantity.getText());
            shwarm = new Drinks("Сок мультифрукт x" + tfDrinkQuantity.getText(), 50*drinkQuantity, shwarm);
        }

        taSummary.appendText(shwarm.getLabel() + '\n' + shwarm.getPrice() + " руб." + '\n');
        DataBaseConnect insertData = new DataBaseConnect();
        insertData.insert(shwarm.getLabel(), shwarm.getPrice());
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
        rbSausages.setSelected(false);
        rbPineapple.setSelected(false);
        rbCheese.setSelected(false);
        rbMeatSauce.setSelected(false);
        rbFrenchFries.setSelected(false);
        rbCola.setSelected(false);
        rbWater.setSelected(false);
        rbAppleJuice.setSelected(false);
        rbMultifruitJuice.setSelected(false);
        tfSausagesQuantity.setText(null);
        tfPineappleQuantity.setText(null);
        tfCheeseQuantity.setText(null);
        tfMeatSauceQuantity.setText(null);
        tfFrenchFriesQuantity.setText(null);
        tfDrinkQuantity.setText(null);
        taSummary.clear();
    }
}
