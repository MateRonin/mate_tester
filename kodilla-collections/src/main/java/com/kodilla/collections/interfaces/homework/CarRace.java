package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(50, -10);
        doRace(ford);

        Opel opel = new Opel(30, -10);
        doRace(opel);

        Fiat fiat = new Fiat(20, -10);
        doRace(fiat);
    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Speed is " + car.getSpeed() + " km/h");
    }
}
