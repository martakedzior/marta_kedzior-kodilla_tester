package com.kodilla.collections.interfaces.homework;

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
}
