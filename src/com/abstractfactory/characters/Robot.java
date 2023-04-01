package com.abstractfactory.characters;

public class Robot implements Character{
    @Override
    public void attack() {
        System.out.println("Robot attacks with laser beam");
    }

    @Override
    public void defend() {
        System.out.println("Robot defends with force field");
    }
}
