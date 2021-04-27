package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int c = 15;
        int d = 5;
        int subResult = calculator.substract(c, d);
        boolean correct2 = ResultChecker.assertEquals(10, subResult);
        if (correct2) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + c + " i " + d);
        }

        double e = 3;
        double powResult = calculator.power(e);
        boolean correct3 = ResultChecker.assertEquals(9, powResult);
        if (correct3) {
            System.out.println("Metoda substract działa poprawnie dla liczby " + e);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczby " + e);
        }
    }
}
