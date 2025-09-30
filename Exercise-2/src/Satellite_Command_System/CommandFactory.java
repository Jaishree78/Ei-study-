package Satellite_Command_System;

public class CommandFactory {
    public static Command getCommand(Satellite sat, String input) {
        String[] parts = input.trim().split(" ");
        String cmd = parts[0].toLowerCase();

        switch (cmd) {
            case "rotate":
                if (parts.length < 2) throw new IllegalArgumentException("Rotate requires a direction");
                return new RotateCommand(sat, parts[1]);
            case "activatepanels":
                return new ActivatePanelsCommand(sat);
            case "deactivatepanels":
                return new DeactivatePanelsCommand(sat);
            case "collectdata":
                return new CollectDataCommand(sat);
            default:
                throw new IllegalArgumentException("Unknown command: " + input);
        }
    }
}