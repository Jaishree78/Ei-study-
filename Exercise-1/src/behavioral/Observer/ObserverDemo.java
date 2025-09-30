package behavioral.Observer;
import java.util.*;


public class ObserverDemo {
    public static void main(String[] args) {
        ScheduleManager manager = new ScheduleManager();
        manager.addListener(new AlertSystem());
        manager.addListener(new LogSystem());

        manager.addTask("Oxygen Check");
        manager.addTask("Oxygen Check"); // triggers observers
    }
}