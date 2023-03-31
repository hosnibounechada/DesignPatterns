package com.strategy;

import com.strategy.paymentstrategy.PaymentStrategy;

class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(double amount){
        paymentStrategy.pay(amount);
    }
}
