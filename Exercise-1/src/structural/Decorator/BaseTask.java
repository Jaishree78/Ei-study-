package structural.Decorator;

class BaseTask implements TaskComponent {
    private final String name;
    BaseTask(String n) { name = n; }
    public void execute() { System.out.println("Executing task: " + name); }
}