package models;

import constants.ElevatorStatus;

public class Elevator {
    private int id;
    private Door elevatorDoor;
    private Display elevatorDisplay;
    private ElevatorStatus elevatorStatus;
    private ElevatorPanel elevatorPanel;

    private int maxCapacity;

    private void move(){}
    private void stop(){}
    private void openDoor(){}
    private void closeDoor(){}
}
