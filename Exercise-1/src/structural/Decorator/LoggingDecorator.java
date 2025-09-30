package structural.Decorator;

// Concrete decorators

class LoggingDecorator extends TaskDecorator {
    LoggingDecorator(TaskComponent t) { super(t); }
    public void execute() {
        super.execute();
        System.out.println(" -> Task logged in system.");
    }
}