package com.templatemethod;

import com.templatemethod.Coffees.Coffee;
import com.templatemethod.Coffees.Espresso;
import com.templatemethod.Coffees.Latte;

public class Main {
    public static void main(String[] args){
        Coffee coffee1 = new Espresso();
        coffee1.prepareCoffee();

        Coffee coffee2 = new Latte();
        coffee2.prepareCoffee();
    }
}
