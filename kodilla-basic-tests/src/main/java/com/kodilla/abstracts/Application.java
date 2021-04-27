package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {
        Dog dog = new Dog(2);
        dog.giveVoice();

        Duck duck = new Duck();
        duck.giveVoice();

    }
}
