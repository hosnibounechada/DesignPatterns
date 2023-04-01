package com.abstractfactory.factories;

import com.abstractfactory.characters.Character;
import com.abstractfactory.characters.Robot;
import com.abstractfactory.vehicles.Spaceship;
import com.abstractfactory.vehicles.Vehicle;
import com.abstractfactory.weapons.LaserGun;
import com.abstractfactory.weapons.Weapon;

public class SciFiGameFactory implements GameFactory{
    @Override
    public Weapon createWeapon() {
        return new LaserGun();
    }

    @Override
    public Vehicle createVehicle() {
        return new Spaceship();
    }

    @Override
    public Character createCharacter() {
        return new Robot();
    }
}
