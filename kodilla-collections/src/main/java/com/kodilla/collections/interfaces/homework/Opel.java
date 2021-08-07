package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car{



    private int acceleration;
    private int deceleration;
    private int speed;

    public Opel (int acceleration, int deceleration) {
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
        if (!(o instanceof Opel)) return false;
        Opel opel = (Opel) o;
        return acceleration == opel.acceleration && deceleration == opel.deceleration && speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceleration, deceleration, speed);
    }
}
