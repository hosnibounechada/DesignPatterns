package com.strategy.paymentstrategy;

public class CreditCardStrategy implements PaymentStrategy{
    private String cardNumber;
    private String expirationDate;
    private String cvv;
    public CreditCardStrategy(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with credit card");
        // Additional logic for processing the credit card payment goes here
    }
}
