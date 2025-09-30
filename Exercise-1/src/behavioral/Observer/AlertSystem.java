package behavioral.Observer;

// Concrete observers

class AlertSystem implements ConflictListener {
    public void onConflict(String task, String conflictWith) {
        System.out.println("[ALERT] Conflict: " + task + " overlaps with " + conflictWith);
    }
}
