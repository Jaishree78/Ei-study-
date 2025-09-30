package behavioral.Observer;

// Observer interface

interface ConflictListener {
    void onConflict(String task, String conflictWith);
}
