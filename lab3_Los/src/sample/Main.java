package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Rectangle rect1 = new Rectangle(50, 50, 100, 200);
        Rectangle rect2 = new Rectangle(50, 50, 100, 200);
        Rectangle rect3 = new Rectangle();
        rect1.move(400, 350);
        //rect3 = rect1.Union(rect1, rect2);
        rect3 = rect1.Union(rect2);

        ColoredRect coloredRect1 = new ColoredRect(rect1, Color.RED, Color.GREEN);
        ColoredRect coloredRect2 = new ColoredRect(rect2, Color.BLUE, Color.YELLOW);
        ColoredRect coloredRect3 = new ColoredRect(rect3, Color.TRANSPARENT, Color.VIOLET);

        Group root = new Group(coloredRect1.draw(), coloredRect2.draw(), coloredRect3.draw());

        //Creating a scene object
        Scene scene = new Scene(root, 1280, 720);
        //Setting title to the Stage
        primaryStage.setTitle("Drawing a Rectangle");
        //Adding scene to the stage
        primaryStage.setScene(scene);

        //Displaying the contents of the stage
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
