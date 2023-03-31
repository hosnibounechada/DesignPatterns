package com.decorator.toppings;

import com.decorator.ToppingDecorator;
import com.decorator.pizzas.Pizza;

public class Woody extends ToppingDecorator {

    public Woody(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", woody";
    }

    public double getCost() {
        return pizza.getCost() + 2.00;
    }
}
