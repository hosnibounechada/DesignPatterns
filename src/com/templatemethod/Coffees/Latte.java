package com.templatemethod.Coffees;

public class Latte extends Coffee{
    @Override
    protected void brewCoffee() {
        System.out.println("Brewing espresso...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar...");
    }
}
