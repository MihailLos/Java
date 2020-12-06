package sample;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetWeather {
    public static Map<String, Object> getWeather(double lat, double lon) throws IOException, JSONException {
        String s = "https://api.darksky.net/forecast/40c495d946e7f24d0470be483f05d4d6/"+lat+","+lon;
        URL url = new URL(s);

        Scanner jsonFile = new Scanner(url.openStream());
        String str = new String();
        while (jsonFile.hasNext()) {
            str += jsonFile.nextLine();
        }
        jsonFile.close();
        JSONObject obj = new JSONObject(str);

        Map<String, String> currentData = new HashMap<String, String>();
        ArrayList<Object> dailyData = new ArrayList<Object>();

        Map<String, Object> weatherData = new HashMap<String, Object>();

        currentData.put("icon", obj.getJSONObject("currently").getString("icon"));
        int currentTemp = (int) obj.getJSONObject("currently").getLong("temperature");
        currentData.put("temp", currentTemp + "");
        weatherData.put("current", currentData);

        JSONArray daily = obj.getJSONObject("daily").getJSONArray("data");

        for(int i = 1; i < daily.length(); i++) {
            Map<String, String> dailyDataPoint = new HashMap<String, String>();
            dailyDataPoint.put("day", Instant.ofEpochSecond(daily.getJSONObject(i).getLong("time"))
                    .atZone(ZoneId.systemDefault()).toLocalDateTime().getDayOfWeek().toString());
            int dailyHigh = (int) daily.getJSONObject(i).getLong("temperatureHigh");
            dailyDataPoint.put("high", dailyHigh+"");
            int dailyLow = (int) daily.getJSONObject(i).getLong("temperatureLow");
            dailyDataPoint.put("low", dailyLow+"");
            dailyDataPoint.put("summary", daily.getJSONObject(i).getString("summary"));

            dailyData.add(dailyDataPoint);
        }
        weatherData.put("daily", dailyData);
        return weatherData;
    }
}
