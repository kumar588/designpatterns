package observer.use.built.in;

import observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    Observable observable;

    private float pressure;
    private float lastPressure;

    public void update(Observable o, Object arg) {

    }

    public void display() {

    }
}
