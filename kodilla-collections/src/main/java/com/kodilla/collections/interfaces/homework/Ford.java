package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car{
    private int speed;
    private int acceleration;
    private int deceleration;


    public Ford (int acceleration, int deceleration) {
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
        if (!(o instanceof Ford)) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed && acceleration == ford.acceleration && deceleration == ford.deceleration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, acceleration, deceleration);
    }


}
