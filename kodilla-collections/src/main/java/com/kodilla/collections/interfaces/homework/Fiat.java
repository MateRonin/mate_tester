package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Fiat implements Car {
    private int acceleration;
    private int deceleration;
    private int speed;

    public Fiat (int acceleration, int deceleration) {
        this.acceleration = acceleration;
        this.deceleration = deceleration;
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + acceleration;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - deceleration;
    }

    @Override
    public int getAcceleration() {
        return acceleration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fiat)) return false;
        Fiat fiat = (Fiat) o;
        return acceleration == fiat.acceleration && deceleration == fiat.deceleration && speed == fiat.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceleration, deceleration, speed);
    }
}
