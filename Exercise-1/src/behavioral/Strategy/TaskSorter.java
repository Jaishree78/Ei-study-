package behavioral.Strategy;

import java.util.List;

// Context
class TaskSorter {
    private SortStrategy strategy;
    public TaskSorter(SortStrategy s) { this.strategy = s; }
    public void setStrategy(SortStrategy s) { this.strategy = s; }
    public void sortTasks(List<Task> tasks) { strategy.sort(tasks); }
}