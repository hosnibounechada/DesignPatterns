package com.abstractfactory.factories;

import com.abstractfactory.characters.Character;
import com.abstractfactory.vehicles.Vehicle;
import com.abstractfactory.weapons.Weapon;

// Abstract factory interface
public interface GameFactory {
    Weapon createWeapon();
    Vehicle createVehicle();
    Character createCharacter();
}
