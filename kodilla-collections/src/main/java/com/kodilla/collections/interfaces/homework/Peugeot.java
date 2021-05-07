package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Peugeot implements Car{
    private int speed;

    public Peugeot(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed * 4);
    }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed - 10);
    }

    @Override
    public String toString() {
        return "Peugeot{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peugeot peugeot = (Peugeot) o;
        return speed == peugeot.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
