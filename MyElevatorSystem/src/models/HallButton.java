package models;

import Interface.Button;
import constants.DirectionStatus;

public class HallButton extends Button {
    private DirectionStatus directionStatus;

    @Override
    public void press() {

    }

    @Override
    public boolean isPressed() {
        return false;
    }
}
