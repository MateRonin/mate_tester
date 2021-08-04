package com.kodilla.collections.interfaces.homework;

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

}
