package com.abstractfactory.weapons;

public class LaserGun implements Weapon{
    @Override
    public void fire() {
        System.out.println("LaserGun fires laser");
    }
}
