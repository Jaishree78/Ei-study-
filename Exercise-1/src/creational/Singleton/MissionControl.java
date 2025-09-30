package creational.Singleton;

class MissionControl {
    private MissionControl() {} // private constructor

    private static class Holder {
        private static final MissionControl INSTANCE = new MissionControl();
    }

    public static MissionControl getInstance() {
        return Holder.INSTANCE;
    }

    public void sendCommand(String cmd) {
        System.out.println("MissionControl: Executing command -> " + cmd);
    }
}