package com.example.javaoop.space.abstraction;

public abstract class FlyingObject {
    public abstract String soundWhenAirborne();

    private boolean isAirborne = false;

    public boolean isAirborne() {
        return isAirborne;
    }

    public void land() {
        isAirborne = false;
    }

    public void becomeAirborne() {
        isAirborne = true;
    }
}
