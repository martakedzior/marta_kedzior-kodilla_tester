package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;


public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(33));
        cars.add(new Peugeot(56));
        cars.add(new Opel(45));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(1);
        cars.remove(new Opel(45));

        System.out.println("\n" + "Cars removed. Collection size: " + cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}

