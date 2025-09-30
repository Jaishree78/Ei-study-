package Satellite_Command_System;

public class RetryDecorator implements Command {
    private Command wrapped;
    private int retries;

    public RetryDecorator(Command cmd, int retries) {
        this.wrapped = cmd;
        this.retries = retries;
    }

    @Override
    public void execute() throws Exception {
        int attempts = 0;
        while (attempts < retries) {
            try {
                wrapped.execute();
                return;
            } catch (Exception e) {
                attempts++;
                Logger.log("Retry " + attempts + " due to error: " + e.getMessage());
                if (attempts == retries) throw e;
            }
        }
    }
}