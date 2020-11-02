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

        if (rbClassicShwarm.isSelected()) {
            Order classicShwarm = new Shawarma("Классическая шаурма", 150*quantity1);
            if (rbCommon.isSelected()) {
                classicShwarm = new NoCostExtra("Обычный соус", 0, classicShwarm);
                if (rbSausages.isSelected()) {
                    classicShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    classicShwarm = new CostExtra("Ананас", 35*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    classicShwarm = new CostExtra("Сыр", 15*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    classicShwarm = new CostExtra("Мясной соус", 25*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    classicShwarm = new CostExtra("Ананас", 20*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbCheesy.isSelected()) {
                classicShwarm = new NoCostExtra("Cырный соус", 0, classicShwarm);
                if (rbSausages.isSelected()) {
                    classicShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    classicShwarm = new CostExtra("Ананас", 35*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    classicShwarm = new CostExtra("Сыр", 15*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    classicShwarm = new CostExtra("Мясной соус", 25*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    classicShwarm = new CostExtra("Ананас", 20*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbGarlic.isSelected()) {
                classicShwarm = new NoCostExtra("Чесночный соус", 0, classicShwarm);
                if (rbSausages.isSelected()) {
                    classicShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    classicShwarm = new CostExtra("Ананас", 35*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    classicShwarm = new CostExtra("Сыр", 15*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    classicShwarm = new CostExtra("Мясной соус", 25*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    classicShwarm = new CostExtra("Ананас", 20*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbGarlic.isSelected()) {
                classicShwarm = new NoCostExtra("Чесночный соус", 0, classicShwarm);
                if (rbSausages.isSelected()) {
                    classicShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    classicShwarm = new CostExtra("Ананас", 35*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    classicShwarm = new CostExtra("Сыр", 15*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    classicShwarm = new CostExtra("Мясной соус", 25*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    classicShwarm = new CostExtra("Ананас", 20*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbChili.isSelected()) {
                classicShwarm = new NoCostExtra("Соус чили", 0, classicShwarm);
                if (rbSausages.isSelected()) {
                    classicShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    classicShwarm = new CostExtra("Ананас", 35*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    classicShwarm = new CostExtra("Сыр", 15*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    classicShwarm = new CostExtra("Мясной соус", 25*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    classicShwarm = new CostExtra("Ананас", 20*quantity1, classicShwarm);
                    if (rbCola.isSelected()) {
                        classicShwarm = new Drinks("Кола", 70*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        classicShwarm = new Drinks("Вода", 20*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок яблочный", 40*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        classicShwarm = new Drinks("Сок мультифрукт", 50*quantity2, classicShwarm);
                        taSummary.appendText(classicShwarm.getLabel() + '\n' + classicShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
        }
        else if (rbHomeShwarm.isSelected()) {
            Order homeShwarm = new Shawarma("Домашняя шаурма", 165*quantity1);
            if (rbCommon.isSelected()) {
                homeShwarm = new NoCostExtra("Обычный соус", 0, homeShwarm);
                if (rbSausages.isSelected()) {
                    homeShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    homeShwarm = new CostExtra("Ананас", 35*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    homeShwarm = new CostExtra("Сыр", 15*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    homeShwarm = new CostExtra("Мясной соус", 25*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    homeShwarm = new CostExtra("Ананас", 20*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbCheesy.isSelected()) {
                homeShwarm = new NoCostExtra("Cырный соус", 0, homeShwarm);
                if (rbSausages.isSelected()) {
                    homeShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    homeShwarm = new CostExtra("Ананас", 35*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    homeShwarm = new CostExtra("Сыр", 15*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    homeShwarm = new CostExtra("Мясной соус", 25*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    homeShwarm = new CostExtra("Ананас", 20*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbGarlic.isSelected()) {
                homeShwarm = new NoCostExtra("Чесночный соус", 0, homeShwarm);
                if (rbSausages.isSelected()) {
                    homeShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    homeShwarm = new CostExtra("Ананас", 35*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    homeShwarm = new CostExtra("Сыр", 15*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    homeShwarm = new CostExtra("Мясной соус", 25*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    homeShwarm = new CostExtra("Ананас", 20*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbGarlic.isSelected()) {
                homeShwarm = new NoCostExtra("Чесночный соус", 0, homeShwarm);
                if (rbSausages.isSelected()) {
                    homeShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    homeShwarm = new CostExtra("Ананас", 35*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    homeShwarm = new CostExtra("Сыр", 15*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    homeShwarm = new CostExtra("Мясной соус", 25*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    homeShwarm = new CostExtra("Ананас", 20*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbChili.isSelected()) {
                homeShwarm = new NoCostExtra("Соус чили", 0, homeShwarm);
                if (rbSausages.isSelected()) {
                    homeShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    homeShwarm = new CostExtra("Ананас", 35*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    homeShwarm = new CostExtra("Сыр", 15*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    homeShwarm = new CostExtra("Мясной соус", 25*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    homeShwarm = new CostExtra("Ананас", 20*quantity1, homeShwarm);
                    if (rbCola.isSelected()) {
                        homeShwarm = new Drinks("Кола", 70*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        homeShwarm = new Drinks("Вода", 20*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок яблочный", 40*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        homeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, homeShwarm);
                        taSummary.appendText(homeShwarm.getLabel() + '\n' + homeShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
        }
        else if (rbVegeShwarm.isSelected()) {
            Order vegeShwarm = new Shawarma("Домашняя шаурма", 130*quantity1);
            if (rbCommon.isSelected()) {
                vegeShwarm = new NoCostExtra("Обычный соус", 0, vegeShwarm);
                if (rbSausages.isSelected()) {
                    vegeShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    vegeShwarm = new CostExtra("Ананас", 35*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    vegeShwarm = new CostExtra("Сыр", 15*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    vegeShwarm = new CostExtra("Мясной соус", 25*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    vegeShwarm = new CostExtra("Ананас", 20*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbCheesy.isSelected()) {
                vegeShwarm = new NoCostExtra("Cырный соус", 0, vegeShwarm);
                if (rbSausages.isSelected()) {
                    vegeShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    vegeShwarm = new CostExtra("Ананас", 35*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    vegeShwarm = new CostExtra("Сыр", 15*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    vegeShwarm = new CostExtra("Мясной соус", 25*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    vegeShwarm = new CostExtra("Ананас", 20*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbGarlic.isSelected()) {
                vegeShwarm = new NoCostExtra("Чесночный соус", 0, vegeShwarm);
                if (rbSausages.isSelected()) {
                    vegeShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    vegeShwarm = new CostExtra("Ананас", 35*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    vegeShwarm = new CostExtra("Сыр", 15*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    vegeShwarm = new CostExtra("Мясной соус", 25*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    vegeShwarm = new CostExtra("Ананас", 20*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbGarlic.isSelected()) {
                vegeShwarm = new NoCostExtra("Чесночный соус", 0, vegeShwarm);
                if (rbSausages.isSelected()) {
                    vegeShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    vegeShwarm = new CostExtra("Ананас", 35*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    vegeShwarm = new CostExtra("Сыр", 15*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    vegeShwarm = new CostExtra("Мясной соус", 25*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    vegeShwarm = new CostExtra("Ананас", 20*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbChili.isSelected()) {
                vegeShwarm = new NoCostExtra("Соус чили", 0, vegeShwarm);
                if (rbSausages.isSelected()) {
                    vegeShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    vegeShwarm = new CostExtra("Ананас", 35*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    vegeShwarm = new CostExtra("Сыр", 15*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    vegeShwarm = new CostExtra("Мясной соус", 25*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    vegeShwarm = new CostExtra("Ананас", 20*quantity1, vegeShwarm);
                    if (rbCola.isSelected()) {
                        vegeShwarm = new Drinks("Кола", 70*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        vegeShwarm = new Drinks("Вода", 20*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок яблочный", 40*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        vegeShwarm = new Drinks("Сок мультифрукт", 50*quantity2, vegeShwarm);
                        taSummary.appendText(vegeShwarm.getLabel() + '\n' + vegeShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
        }
        else if (rbExtraShwarm.isSelected()) {
            Order extraShwarm = new Shawarma("Домашняя шаурма", 200*quantity1);
            if (rbCommon.isSelected()) {
                extraShwarm = new NoCostExtra("Обычный соус", 0, extraShwarm);
                if (rbSausages.isSelected()) {
                    extraShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    extraShwarm = new CostExtra("Ананас", 35*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    extraShwarm = new CostExtra("Сыр", 15*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    extraShwarm = new CostExtra("Мясной соус", 25*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    extraShwarm = new CostExtra("Ананас", 20*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbCheesy.isSelected()) {
                extraShwarm = new NoCostExtra("Cырный соус", 0, extraShwarm);
                if (rbSausages.isSelected()) {
                    extraShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    extraShwarm = new CostExtra("Ананас", 35*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    extraShwarm = new CostExtra("Сыр", 15*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    extraShwarm = new CostExtra("Мясной соус", 25*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    extraShwarm = new CostExtra("Ананас", 20*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbGarlic.isSelected()) {
                extraShwarm = new NoCostExtra("Чесночный соус", 0, extraShwarm);
                if (rbSausages.isSelected()) {
                    extraShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    extraShwarm = new CostExtra("Ананас", 35*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    extraShwarm = new CostExtra("Сыр", 15*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    extraShwarm = new CostExtra("Мясной соус", 25*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    extraShwarm = new CostExtra("Ананас", 20*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbGarlic.isSelected()) {
                extraShwarm = new NoCostExtra("Чесночный соус", 0, extraShwarm);
                if (rbSausages.isSelected()) {
                    extraShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    extraShwarm = new CostExtra("Ананас", 35*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    extraShwarm = new CostExtra("Сыр", 15*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    extraShwarm = new CostExtra("Мясной соус", 25*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    extraShwarm = new CostExtra("Ананас", 20*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
            else if (rbChili.isSelected()) {
                extraShwarm = new NoCostExtra("Соус чили", 0, extraShwarm);
                if (rbSausages.isSelected()) {
                    extraShwarm = new CostExtra("Охотничьи колбаски", 50*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbPineapple.isSelected()) {
                    extraShwarm = new CostExtra("Ананас", 35*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbCheese.isSelected()) {
                    extraShwarm = new CostExtra("Сыр", 15*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbMeatSauce.isSelected()) {
                    extraShwarm = new CostExtra("Мясной соус", 25*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
                else if (rbFrenchFries.isSelected()) {
                    extraShwarm = new CostExtra("Ананас", 20*quantity1, extraShwarm);
                    if (rbCola.isSelected()) {
                        extraShwarm = new Drinks("Кола", 70*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbWater.isSelected()) {
                        extraShwarm = new Drinks("Вода", 20*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbAppleJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок яблочный", 40*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                    else if (rbMultifruitJuice.isSelected()) {
                        extraShwarm = new Drinks("Сок мультифрукт", 50*quantity2, extraShwarm);
                        taSummary.appendText(extraShwarm.getLabel() + '\n' + extraShwarm.getPrice() + " руб." + '\n');
                    }
                }
            }
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
