package com.abstractfactory;

import com.abstractfactory.characters.Character;
import com.abstractfactory.factories.FantasyGameFactory;
import com.abstractfactory.factories.GameFactory;
import com.abstractfactory.factories.SciFiGameFactory;
import com.abstractfactory.vehicles.Vehicle;

public class Main {
    public static void main(String[] args){
        GameFactory fantasyGameFactory = new FantasyGameFactory();
        GameFactory sciFiGameFactory = new SciFiGameFactory();

        Character elf = fantasyGameFactory.createCharacter();
        elf.attack();
        elf.defend();

        Vehicle spaceship = sciFiGameFactory.createVehicle();
        spaceship.move();

    }
}
