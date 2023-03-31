package com.builder;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder().addName("Hosni").addAge(28).addGender("Male").build();
        System.out.printf(person.toString());
    }
}