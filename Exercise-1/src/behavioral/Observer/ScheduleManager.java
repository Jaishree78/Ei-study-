package behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

// Subject

class ScheduleManager {
    private final List<String> tasks = new ArrayList<>();
    private final List<ConflictListener> listeners = new ArrayList<>();

    public void addListener(ConflictListener l) { listeners.add(l); }

    public void addTask(String task) {
        for (String existing : tasks) {
            if (existing.equalsIgnoreCase(task)) {
                // notify all observers
                for (ConflictListener l : listeners) {
                    l.onConflict(task, existing);
                }
                return;
            }
        }
        tasks.add(task);
        System.out.println("Task added: " + task);
    }
}