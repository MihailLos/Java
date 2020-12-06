package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;

public class MessageBox {
    private String postIndex;

    public MessageBox() {
        postIndex = "21044";
    }

    public void show() {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Изменить город");
        stage.setMinWidth(250);

        TextField postInd = new TextField();
        postInd.setPromptText("Почтовый индекс");
        postInd.setMaxWidth(50);

        Label postLabel = new Label();
        postLabel.setText("Индекс: ");

        HBox postIndPane = new HBox(10);
        postIndPane.setAlignment(Pos.CENTER);
        postIndPane.getChildren().addAll(postLabel, postInd);

        Button okButton = new Button();
        okButton.setText("OK");
        okButton.setOnAction(e -> {
            postIndex = postInd.getText();
            stage.close();
        });

        Button cancelButton = new Button();
        okButton.setText("Отмена");
        cancelButton.setOnAction(e -> stage.close());

        HBox buttons = new HBox(10);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(okButton, cancelButton);

        VBox pane = new VBox(20);
        pane.setPrefSize(250, 100);
        pane.setStyle("-fx-background-color: skyblue");
        pane.getChildren().addAll(postIndPane, buttons);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.showAndWait();
    }

    public String getPostIndex() {
        return postIndex;
    }
}
