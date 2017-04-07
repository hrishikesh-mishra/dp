package com.hrishikesh.dp.observerpattern.weatherstation;

import com.hrishikesh.dp.observerpattern.api.Observer;
import com.hrishikesh.dp.observerpattern.api.Subject;
import com.hrishikesh.dp.observerpattern.weatherstation.entities.WData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hrishikesh.mishra
 */
public class WeatherData implements Subject{
    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        WData wData = new WData(temperature, humidity, pressure);
        observers.forEach(o -> o.update(wData));
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
