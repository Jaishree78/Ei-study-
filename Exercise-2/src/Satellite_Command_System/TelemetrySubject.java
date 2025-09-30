package Satellite_Command_System;

import java.util.ArrayList;
import java.util.List;

public class TelemetrySubject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) { observers.add(o); }

    public void notifyObservers(String msg) {
        for (Observer o : observers) {
            o.update(msg);
        }
    }
}