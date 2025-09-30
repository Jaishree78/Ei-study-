package Satellite_Command_System;

public class RotateCommand implements Command {
    private Satellite satellite;
    private String direction;

    public RotateCommand(Satellite satellite, String direction) {
        this.satellite = satellite;
        this.direction = direction;
    }

    @Override
    public void execute() {
        satellite.setOrientation(direction);
        Logger.log("Satellite rotated to " + direction);
    }
}