package structural.Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        LegacyTask old = new LegacyTask("Check space suit pressure");
        NewTask task = new LegacyTaskAdapter(old);
        task.show();
    }
}
