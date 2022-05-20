package observer.use.built.in;

import observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    public void update(Observable observable, Object obj) {

        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current Conditions: Tempurature: "+ temperature + " Humidity: "+ humidity);
    }
}
