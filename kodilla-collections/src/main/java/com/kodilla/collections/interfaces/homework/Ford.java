package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed * 2);
    }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed - 34);
    }
}
