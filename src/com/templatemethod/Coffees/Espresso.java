package com.templatemethod.Coffees;

public class Espresso extends Coffee{
    @Override
    protected void brewCoffee() {
        System.out.println("Brewing espresso...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar...");
    }
}
