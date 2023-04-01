package com.templatemethod.Coffees;

public abstract class Coffee {
    public final void prepareCoffee(){
        boilWater();
        brewCoffee();
        pourInCup();
        addCondiments();
    }
    protected abstract void brewCoffee();

    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void pourInCup() {
        System.out.println("Pouring coffee in cup...");
    }
}
