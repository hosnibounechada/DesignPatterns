package com.abstractfactory.vehicles;

public class Spaceship implements Vehicle{
    @Override
    public void move() {
        System.out.println("Spaceship flies");
    }
}
