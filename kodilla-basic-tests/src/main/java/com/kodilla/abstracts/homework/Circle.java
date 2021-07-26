package com.kodilla.abstracts.homework;

public class Circle extends Shape {


    public Circle(double parameterA, double parameterB, double parameterR) {
        super(parameterA, parameterB, parameterR);
    }

    @Override
    public double calcSurface() {
        return PI * getParameterR() * getParameterR();
    }

    @Override
    public double calcPerimeter() {
        return 2 * PI * getParameterR();
    }
}
