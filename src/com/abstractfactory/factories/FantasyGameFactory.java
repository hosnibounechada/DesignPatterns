package com.abstractfactory.factories;

import com.abstractfactory.characters.Character;
import com.abstractfactory.characters.Elf;
import com.abstractfactory.vehicles.Horse;
import com.abstractfactory.vehicles.Vehicle;
import com.abstractfactory.weapons.Sword;
import com.abstractfactory.weapons.Weapon;

public class FantasyGameFactory implements GameFactory{
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Vehicle createVehicle() {
        return new Horse();
    }

    @Override
    public Character createCharacter() {
        return new Elf();
    }
}
