package com.jornacondev.cursos.patronesdiseno.observer;

public class ForecastDisplay implements DisplayElement, Observer {
    private float humidity;

    public ForecastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast conditions: " + humidity + "% humidity");
    }

}
