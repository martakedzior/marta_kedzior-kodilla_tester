package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(50);
        doRace(ford);

        Opel opel = new Opel(45);
        doRace(opel);

        Peugeot peugeot = new Peugeot(20);
        doRace(peugeot);

    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }



}


