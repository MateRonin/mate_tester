package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        int squareResult = calculator.square(a);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);
        if (correctSubtract) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correctSquare= ResultChecker.assertEquals(25, squareResult);
        if (correctSquare) {
            System.out.println("Metoda square działa poprawnie dla liczb " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczb " + a);
        }

    }
}
