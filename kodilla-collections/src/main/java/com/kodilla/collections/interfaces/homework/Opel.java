package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car{
    private int speed;

    public Opel(int speed){
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
        System.out.println(speed - 20);
    }

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
