package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {
    private int acceleration;
    private int deceleration;

    public Fiat (int acceleration, int deceleration) {
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }

    @Override
    public int getSpeed() {
        return 3 * acceleration + 2* deceleration;
    }

    @Override
    public void increaseSpeed() {

    }

    @Override
    public void decreaseSpeed() {

    }
}
