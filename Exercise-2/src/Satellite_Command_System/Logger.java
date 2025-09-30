package Satellite_Command_System;

import java.time.LocalDateTime;

public class Logger {
    public static void log(String message) {
        System.out.println(LocalDateTime.now() + " [LOG] " + message);
    }
}
