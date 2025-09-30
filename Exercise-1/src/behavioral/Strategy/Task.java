package behavioral.Strategy;

class Task {
    String name;
    int time;      // e.g., 930 = 9:30
    int priority;  // 1 = high, 2 = medium, 3 = low
    int duration;  // in minutes

    Task(String n, int t, int p, int d) {
        name = n; time = t; priority = p; duration = d;
    }

    public String toString() {
        return name + " (Time=" + time + ", P" + priority + ", Dur=" + duration + "min)";
    }
}
