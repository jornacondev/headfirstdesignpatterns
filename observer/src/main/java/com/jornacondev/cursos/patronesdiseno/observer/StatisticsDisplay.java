package com.jornacondev.cursos.patronesdiseno.observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements DisplayElement, Observer {
    private final List<Float> temperatures;

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
        temperatures = new ArrayList<>();
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatures.add(temperature);
        display();
    }

    @Override
    public void display() {
        float maxTemperature = temperatures.stream().max(Float::compare).get();
        float minTemperature = temperatures.stream().min(Float::compare).get();
        float avgTemperature = (maxTemperature + minTemperature) / 2;
        System.out.println("Statistics: - Max Temp:" + maxTemperature + ", Min Temp: " + minTemperature + ", avegage: " + avgTemperature);
    }

}
