package Satellite_Command_System;

public class CollectDataCommand implements Command {
    private Satellite satellite;

    public CollectDataCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() throws Exception {
        satellite.collectData();
        Logger.log("Data collected successfully.");
    }
}
