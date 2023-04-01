package com.abstractfactory.weapons;

public class Sword implements Weapon{
    @Override
    public void fire() {
        System.out.println("Sword slashes");
    }
}
