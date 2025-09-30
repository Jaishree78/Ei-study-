package structural.Decorator;

// Decorator

abstract class TaskDecorator implements TaskComponent {
    protected TaskComponent task;
    TaskDecorator(TaskComponent t) { task = t; }
    public void execute() { task.execute(); }
}