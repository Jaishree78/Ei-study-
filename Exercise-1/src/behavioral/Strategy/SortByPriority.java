package behavioral.Strategy;

import java.util.Comparator;
import java.util.List;

// Concrete strategies

class SortByPriority implements SortStrategy {
    public void sort(List<Task> tasks) {
        tasks.sort(Comparator.comparingInt(t -> t.priority));
    }
}
