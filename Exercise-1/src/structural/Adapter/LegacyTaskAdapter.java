package structural.Adapter;

// Adapter
class LegacyTaskAdapter extends NewTask {
    LegacyTaskAdapter(LegacyTask oldTask) {
        super("Imported -> " + oldTask.getDetails());
    }
}