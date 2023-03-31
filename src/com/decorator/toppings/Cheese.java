package com.decorator.toppings;

import com.decorator.ToppingDecorator;
import com.decorator.pizzas.Pizza;

public class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    public double getCost() {
        return pizza.getCost() + 1.00;
    }
}
