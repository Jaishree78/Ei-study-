package behavioral.Strategy;

import java.util.Arrays;
import java.util.List;

public class StrategyDemo {
    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList(
                new Task("Oxygen Check", 930, 2, 30),
                new Task("Satellite Update", 800, 1, 45),
                new Task("Water Recycling", 1100, 3, 20)
        );

        TaskSorter sorter = new TaskSorter(new SortByTime());
        sorter.sortTasks(tasks);
        System.out.println("Sorted by Time: " + tasks);

        sorter.setStrategy(new SortByPriority());
        sorter.sortTasks(tasks);
        System.out.println("Sorted by Priority: " + tasks);

        sorter.setStrategy(new SortByDuration());
        sorter.sortTasks(tasks);
        System.out.println("Sorted by Duration: " + tasks);
    }
}