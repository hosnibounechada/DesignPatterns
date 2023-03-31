package com.decorator;

import com.decorator.pizzas.PlainPizza;
import com.decorator.toppings.Cheese;
import com.decorator.pizzas.Pizza;
import com.decorator.toppings.Woody;
public class Main {
    public static void main(String[] args){
        Pizza pizza = new PlainPizza();
        pizza = new Woody(new Cheese(pizza));

        System.out.println(pizza.getDescription()); // Output: Plain pizza, cheese, woody
        System.out.println(pizza.getCost()); // Output: 8.00
    }
}
