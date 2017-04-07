package com.hrishikesh.dp.observerpattern.weatherstation;

import com.hrishikesh.dp.observerpattern.weatherstation.displayunits.CurrentConditionsDisplay;

/**
 * <p>
 *     Weather Station based Observer Pattern
 *
 *     {@link "http://hrishikeshmishra.com/observer-pattern/"}
 * </p>
 * Created by hrishikesh.mishra
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
