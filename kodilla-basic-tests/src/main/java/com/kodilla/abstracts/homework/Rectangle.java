package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle(double parameterA, double parameterB, double parameterR) {
        super(1, 2,3);
    }

    @Override
    public double calcSurface() {
        return getParameterA() * getParameterB();
    }

    @Override
    public double calcPerimeter() {
        return 2 * getParameterA() + 2 * getParameterB();
    }
}
