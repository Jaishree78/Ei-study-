package structural.Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        TaskComponent task = new BaseTask("Satellite Calibration");
        TaskComponent decorated = new ReminderDecorator(new LoggingDecorator(task));
        decorated.execute();
    }
}