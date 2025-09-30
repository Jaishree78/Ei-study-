package behavioral.Observer;

class LogSystem implements ConflictListener {
    public void onConflict(String task, String conflictWith) {
        System.out.println("[LOG] Conflict recorded for " + task);
    }
}
