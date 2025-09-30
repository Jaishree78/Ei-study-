package Satellite_Command_System;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Command> history = new ArrayList<>();

    public void executeCommand(Command cmd) {
        try {
            cmd.execute();
            history.add(cmd);
        } catch (Exception e) {
            Logger.log("Error executing command: " + e.getMessage());
        }
    }
}