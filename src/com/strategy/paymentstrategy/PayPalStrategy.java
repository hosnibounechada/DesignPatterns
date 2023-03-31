package com.strategy.paymentstrategy;

public class PayPalStrategy implements PaymentStrategy{
    private final String email;
    private final String password;
    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with PayPal");
        // Additional logic for processing the PayPal payment goes here
    }
}
