package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    protected TextField tfQuantity1;
    @FXML
    protected TextField tfQuantity2;
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
        double price;
        int quantity1 = Integer.parseInt(tfQuantity1.getText());
        int quantity2 = Integer.parseInt(tfQuantity2.getText());

        Order shwarm = null;

        if (rbClassicShwarm.isSelected()) {
            shwarm = new Shawarma("Классическая шаурма", 150*quantity1);
        } else if (rbHomeShwarm.isSelected()) {
            shwarm = new Shawarma("Домашняя шаурма", 1659*quantity1);
        } else if (rbVegeShwarm.isSelected()) {
            shwarm = new Shawarma("Вегетарианская шаурма", 130*quantity1);
        } else if (rbExtraShwarm.isSelected()) {
            shwarm = new Shawarma("Шаурма 'Экстра'", 200*quantity1);
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
            shwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, shwarm);
        } else if (rbPineapple.isSelected()) {
            shwarm = new CostExtra("Ананас", 35*quantity1, shwarm);
        } else if (rbCheese.isSelected()) {
            shwarm = new CostExtra("Сыр", 15*quantity1, shwarm);
        } else if (rbMeatSauce.isSelected()) {
            shwarm = new CostExtra("Мясная подливка", 25*quantity1, shwarm);
        } else if (rbFrenchFries.isSelected()) {
            shwarm = new CostExtra("Картофель фри", 20*quantity1, shwarm);
        }

        if (rbCola.isSelected()) {
            shwarm = new Drinks("Кола", 70*quantity2, shwarm);
        } else if (rbWater.isSelected()) {
            shwarm = new Drinks("Вода", 20*quantity2, shwarm);
        } else if (rbAppleJuice.isSelected()) {
            shwarm = new Drinks("Сок яблочный", 40*quantity2, shwarm);
        } else if (rbMultifruitJuice.isSelected()) {
            shwarm = new Drinks("Сок мультифрукт", 50*quantity2, shwarm);
        }

        taSummary.appendText(shwarm.getLabel() + '\n' + shwarm.getPrice() + " руб." + '\n');
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
        tfQuantity1.setText(null);
        tfQuantity2.setText(null);
    }
}
