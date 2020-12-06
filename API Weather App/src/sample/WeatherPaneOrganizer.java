package sample;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import org.json.JSONException;
import org.json.JSONObject;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class WeatherPaneOrganizer {
    private static final int WIDTH=1000, HEIGHT=600;
    BorderPane root;
    String cityName;

    Map<String, Object> weatherData;

    public WeatherPaneOrganizer() throws IOException, JSONException {
        cityName = "Columbia, MD";
        root = new BorderPane();
        root.setStyle("-fx-background-color: cadetblue");
        root.setPrefSize(WIDTH, HEIGHT);
        weatherData = GetWeather.getWeather(39.167666, -76.860485);

        setTop();
        setCurrent();
        setDaily();
    }

    public Pane getRoot() {
        return root;
    }

    private void setTop() {
        HBox top = new HBox();
        root.setTop(top);
        HBox.setMargin(top, new Insets(15, 12, 15, 12));
        top.setAlignment(Pos.CENTER);
        top.setStyle("-fx-background-color: orange");

        Label city = new Label(cityName);
        city.setStyle("-fx-text-fill: white;" + "-fx-font-size: 40;");

        Button exitButton = new Button();
        exitButton.setText("Выход");
        HBox.setMargin(exitButton, new Insets(0,0,0,20));
        exitButton.setOnAction(e-> Platform.exit());

        Button change = new Button();
        change.setText("Изменить");
        HBox.setMargin(change, new Insets(0,0,0,20));
        change.setOnAction(e-> {
            try {
                changeCity();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (JSONException e1) {
                e1.printStackTrace();
            }
        });

        top.getChildren().addAll(city, change, exitButton);
    }

    private void changeCity() throws IOException, JSONException {
        MessageBox newCity = new MessageBox();
        newCity.show();
        String postIndex = newCity.getPostIndex();
        String APIKey = "AIzaSyAnzLNVx6BZApznz8ggm9ty7RZMktnk5E0";
        String s = "https://maps.googleapis.com/maps/api/geocode/json?address=" + postIndex + "&key=" + APIKey;
        URL url = new URL(s);

        Scanner jsonFile = new Scanner(url.openStream());
        String str = new String();
        while (jsonFile.hasNext()) {
            str += jsonFile.nextLine();
        }
        jsonFile.close();
        JSONObject obj = new JSONObject(str);

        cityName = obj.getJSONArray("results").getJSONObject(0).getString("formatted_address");
        cityName = cityName.substring(0, cityName.indexOf(",") + 4);

        double lat = obj.getJSONArray("results")
                .getJSONObject(0)
                .getJSONObject("geometry")
                .getJSONObject("location")
                .getDouble("lat");
        double lon = obj.getJSONArray("results")
                .getJSONObject(0)
                .getJSONObject("geometry")
                .getJSONObject("location")
                .getDouble("lng");

        weatherData = GetWeather.getWeather(lat, lon);

        setTop();
        setCurrent();
        setDaily();
    }

    private void setCurrent() {
        VBox currentPane = new VBox();
        currentPane.setPrefWidth(WIDTH*0.25);
        currentPane.setStyle("-fx-background-color: purple");
        currentPane.setAlignment(Pos.CENTER);
        currentPane.setPadding(new Insets(15));

        HBox tempBox = new HBox();
        tempBox.setAlignment(Pos.CENTER);

        Map<String, String> currentWeather = (Map<String, String>) weatherData.get("current");

        Image currentImageIcon = new Image(StatusImage.getImage(currentWeather.get("icon")));
        ImageView currentImage = new ImageView(currentImageIcon);
        Node summaryImage = currentImage;
        VBox.setMargin(summaryImage, new Insets(0,0,20,0));

        Label currently = new Label("Currently: ");
        currently.setStyle("-fx-text-fill: white;" + "-fx-font-size: 30;");
        currently.setMaxHeight(Double.MAX_VALUE);

        Label currentTemp = new Label(currentWeather.get("temp"));
        currentTemp.setStyle("-fx-text-fill: white;" + "-fx-font-size: 40;");
        tempBox.getChildren().addAll(currently, currentTemp);

        currentPane.getChildren().addAll(summaryImage, tempBox);
        root.setLeft(currentPane);
    }

    private void setDaily() {
        VBox dailyPane = new VBox();
        dailyPane.setPrefWidth(WIDTH*0.625);
        dailyPane.setStyle("-fx-background-color: yellow");
        dailyPane.setAlignment(Pos.CENTER);
        dailyPane.setPadding(new Insets(15));

        ArrayList<Map<String, String>> dailyForecast = (ArrayList<Map<String, String>>) weatherData.get("daily");

        for (int i = -1; i < dailyForecast.size(); i++) {
            HBox daily = new HBox();
            Label day = new Label("Day");
            if (i > -1) {
                day = new Label(dailyForecast.get(i).get("day"));
            }

            day.setStyle("-fx-text-fill: black;" + "-fx-font-size: 20;");
            day.setMaxHeight(Double.MAX_VALUE);
            day.setPrefWidth(WIDTH*3/16);

            Label high = new Label("Hi");
            if (i > -1) {
                high = new Label(dailyForecast.get(i).get("high"));
            }

            high.setStyle("-fx-text-fill: black;" + "-fx-font-size: 30;");
            high.setMaxHeight(Double.MAX_VALUE);
            high.setPrefWidth(WIDTH/16);

            Label low = new Label("Lo");
            if (i > -1) {
                low = new Label(dailyForecast.get(i).get("low"));
            }

            low.setStyle("-fx-text-fill: black;" + "-fx-font-size: 30;");
            low.setMaxHeight(Double.MAX_VALUE);
            low.setPrefWidth(WIDTH/16);

            Label summary = new Label("Summary");
            if (i > -1) {
                summary = new Label(dailyForecast.get(i).get("summary"));
            }

            summary.setStyle("-fx-text-fill: black;" + "-fx-font-size: 20;");
            summary.setMaxHeight(Double.MAX_VALUE);
            summary.setPrefWidth(WIDTH*5/16);
            summary.setWrapText(true);

            daily.getChildren().addAll(day, high, low, summary);
            dailyPane.getChildren().add(daily);
        }

        root.setCenter(dailyPane);
    }
}
