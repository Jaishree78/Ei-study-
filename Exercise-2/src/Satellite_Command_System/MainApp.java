package Satellite_Command_System;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Satellite sat = new Satellite();
        CommandInvoker invoker = new CommandInvoker();

        TelemetrySubject telemetry = new TelemetrySubject();
        telemetry.addObserver(new MonitorObserver("Console"));
        telemetry.addObserver(new MonitorObserver("Logger"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Satellite Command System - Type 'exit' to quit");

        while (true) {
            System.out.print("> ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) break;

            try {
                Command cmd = CommandFactory.getCommand(sat, input);
                // Wrap with retry
                Command retryCmd = new RetryDecorator(cmd, 2);
                invoker.executeCommand(retryCmd);
                telemetry.notifyObservers("Executed: " + input + " | State: " + sat);
            } catch (Exception e) {
                Logger.log("Invalid input: " + e.getMessage());
            }
        }
        sc.close();
    }
}