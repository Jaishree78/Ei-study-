package Satellite_Command_System;


public class Satellite {
    private String orientation;
    private boolean panelsActive;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";
        this.panelsActive = false;
        this.dataCollected = 0;
    }

    public void setOrientation(String direction) {
        this.orientation = direction;
    }

    public void activatePanels() {
        this.panelsActive = true;
    }

    public void deactivatePanels() {
        this.panelsActive = false;
    }

    public void collectData() throws Exception {
        if (!panelsActive) {
            throw new Exception("Cannot collect data: Panels are inactive!");
        }
        this.dataCollected += 10;
    }

    public String getOrientation() { return orientation; }
    public boolean isPanelsActive() { return panelsActive; }
    public int getDataCollected() { return dataCollected; }

    @Override
    public String toString() {
        return "Satellite State => Orientation: " + orientation +
                ", Panels: " + (panelsActive ? "Active" : "Inactive") +
                ", Data Collected: " + dataCollected;
    }
}
