package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.swing.text.html.ImageView;

public class Controller {
    @FXML
    private ImageView ivShwarm;
    @FXML
    private Label lbShwarmType;
    @FXML
    private RadioButton rbClassicShwarm;
    @FXML
    private RadioButton rbHomeShwarm;
    @FXML
    private RadioButton rbVegeShwarm;
    @FXML
    private RadioButton rbExtraShwarm;
    @FXML
    private Label lbShwarmSize;
    @FXML
    private ChoiceBox cbShwarmSize;
    @FXML
    private Label lbQuantity;
    @FXML
    private TextField tfQuantity;
    @FXML
    private Label lbSauce;
    @FXML
    private RadioButton rbCommon;
    @FXML
    private RadioButton rbCheesy;
    @FXML
    private RadioButton rbGarlic;
    @FXML
    private RadioButton rbChili;
    @FXML
    private Label lbAdds;
    @FXML
    private RadioButton rbSausages;
    @FXML
    private RadioButton rbPineapple;
    @FXML
    private RadioButton rbCheese;
    @FXML
    private RadioButton rbMeetSauce;
    @FXML
    private RadioButton rbFrenchFries;
    @FXML
    private Button btnOrder;
    @FXML
    private Button btnCancel;
    @FXML
    private TextArea taSummary;

    @FXML
    private void handlerOrderButtonAction(ActionEvent event) {
        // shwarm price
        double price;
        int quantity = Integer.parseInt(tfQuantity.getText());
        if(rbClassicShwarm.isSelected()) {
            price = 150;
            taSummary.appendText("Классическая шаурма, " + price + ", " + quantity + "/n");
        } else if (rbHomeShwarm.isSelected()) {
            price = 165;
            taSummary.appendText("Домашняя шаурма, " + price + ", " + quantity + "/n");
        } else if (rbVegeShwarm.isSelected()) {
            price = 130;
            taSummary.appendText("Вегетарианская шаурма, " + price + ", " + quantity + "/n");
        } else if (rbExtraShwarm.isSelected()) {
            price = 200;
            taSummary.appendText("Шаурма 'Экстра', " + price + ", " + quantity + "/n");
        }
    }

    @FXML
    private void handlerCancelButtonAction(ActionEvent event) {

    }
}