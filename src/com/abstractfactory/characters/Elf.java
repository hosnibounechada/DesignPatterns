package com.abstractfactory.characters;

public class Elf implements Character{
    @Override
    public void attack() {
        System.out.println("Elf attacks with bow and arrow");
    }

    @Override
    public void defend() {
        System.out.println("Elf defends with shield");
    }
}
