package sample;

public class StatusImage {
    public static String getImage(String status) {
        switch (status) {
            case "clear-day": return "https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-clear-icon.png";
            case "clear-night": return "https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-clear-night-icon.png";
            case "rain": return "https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-showers-scattered-icon.png";
            case "snow": return "https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-snow-icon.png";
            case "sleet": return "https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-hail-icon.png";
            case "wind": return "https://icons.iconarchive.com/icons/icons-land/weather/128/Wind-Flag-Storm-icon.png";
            case "fog": return "https://icons.iconarchive.com/icons/custom-icon-design/lovely-weather/512/fog-icon.png";
            case "cloudy": return "https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-many-clouds-icon.png";
            case "partly-cloudy-day": return "https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-clouds-icon.png";
            case "partly-cloudy-night": return "https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-clouds-night-icon.png";
        }
        return "https://icons.iconarchive.com/icons/icons-land/weather/256/Rainbow-icon.png";
    }
}
