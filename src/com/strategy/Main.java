package com.strategy;

import com.strategy.paymentstrategy.CreditCardStrategy;
import com.strategy.paymentstrategy.PayPalStrategy;
import com.strategy.paymentstrategy.PaymentStrategy;

public class Main {
    public static void main(String[] args){
        PaymentStrategy creditCard = new CreditCardStrategy("1234 5678 1234 5678","21/11","333");
        ShoppingCart shoppingCart1 = new ShoppingCart(creditCard);
        shoppingCart1.pay(100);

        PaymentStrategy payPal = new PayPalStrategy("user@gmail.com","12345678");
        ShoppingCart shoppingCart2 =  new ShoppingCart(payPal);
        shoppingCart2.pay(200);

    }
}
