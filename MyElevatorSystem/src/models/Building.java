package models;

import java.util.List;

public class Building {
    private List<Floor>floorList;
    private List<Elevator>elevatorList;

    private static Building buildingInstance = null;
    private Building() {}
    public static Building getInstance() {
        if (buildingInstance == null) {
            buildingInstance = new Building();
        }
        return buildingInstance;
    }
}
