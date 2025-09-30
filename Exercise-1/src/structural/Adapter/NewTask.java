package structural.Adapter;

class NewTask {
    String description;
    NewTask(String d) { this.description = d; }
    public void show() { System.out.println("New Task: " + description); }
}
