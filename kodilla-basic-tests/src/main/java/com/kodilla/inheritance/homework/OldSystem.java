package com.kodilla.inheritance.homework;

public class OldSystem extends OperatingSystem {

    public OldSystem (int year) {
        super(year);
        System.out.println("Old system constructor");
    }
    @Override
    public void turnOn() {
        System.out.println("System turned ON/Safe mode");
    }

    @Override
    public void turnOff() {
        System.out.println("System turned OFF/Safe mode");
    }

}
