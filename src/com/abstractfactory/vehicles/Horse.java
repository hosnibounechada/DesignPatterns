package com.abstractfactory.vehicles;

public class Horse implements Vehicle{
    @Override
    public void move() {
        System.out.println("Horse gallops");
    }
}
