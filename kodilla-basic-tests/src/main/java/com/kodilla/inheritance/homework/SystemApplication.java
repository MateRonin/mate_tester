package com.kodilla.inheritance.homework;

public class SystemApplication {
    public static void main(String[] args) {
        NewSystem newSystem = new NewSystem(2018);
        newSystem.turnOn();
        System.out.println(newSystem.getYear());

        OldSystem oldSystem = new OldSystem(2002);
        oldSystem.turnOff();
        System.out.println(oldSystem.getYear());

        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOn();
        System.out.println(operatingSystem.getYear());

    }
}
