package com.kodilla.inheritance.homework;

public class NewSystem extends OperatingSystem {

    public NewSystem (int year) {
        super(year);
        System.out.println("New system constructor");
    }

    @Override
    public void turnOn() {
        System.out.println("System turned ON/Turbo mode");
    }

    @Override
    public void turnOff() {
        System.out.println("System turned OFF/Turbo mode");
    }

}
