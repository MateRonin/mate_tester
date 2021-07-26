package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double parameterA;
    private double parameterB;
    private double parameterR;
    static final double PI = 3.1415927;

    public Shape(double parameterA, double parameterB, double parameterR) {
        this.parameterA = parameterA;
        this.parameterB = parameterB;
        this.parameterR = parameterR;
    }

    public double getParameterA() {
        return parameterA;
    }

    public double getParameterB() {
        return parameterB;
    }

    public double getParameterR() {
        return parameterR;
    }

    public abstract double calcSurface();

    public abstract double calcPerimeter();
}


