package structural.Decorator;

// Concrete decorators

class ReminderDecorator extends TaskDecorator {
    ReminderDecorator(TaskComponent t) { super(t); }
    public void execute() {
        super.execute();
        System.out.println(" -> Reminder set for this task!");
    }
}