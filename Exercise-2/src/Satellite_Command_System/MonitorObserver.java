package Satellite_Command_System;

public class MonitorObserver implements Observer {
    private String name;

    public MonitorObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("[Monitor " + name + "] " + message);
    }
}