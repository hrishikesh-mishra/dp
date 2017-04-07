package com.hrishikesh.dp.observerpattern.weatherstation.displayunits;

import com.hrishikesh.dp.observerpattern.api.Observer;
import com.hrishikesh.dp.observerpattern.api.Subject;
import com.hrishikesh.dp.observerpattern.weatherstation.DisplayElement;
import com.hrishikesh.dp.observerpattern.weatherstation.entities.WData;

/**
 * Created by hrishikesh.mishra
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + " F degree and " +
            + humidity + " % humidity. ");
    }

    @Override
    public void update(Object object) {
        if(!(object instanceof WData)) throw new IllegalArgumentException();
        WData data = (WData) object;
        this.temperature = data.getTemperature();
        this.humidity = data.getHumidity();
        display();
    }
}
