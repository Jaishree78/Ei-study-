package creational.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        MissionControl mc1 = MissionControl.getInstance();
        MissionControl mc2 = MissionControl.getInstance();
        mc1.sendCommand("Activate solar panels");

        System.out.println("Same instance? " + (mc1 == mc2)); // true
    }
}
