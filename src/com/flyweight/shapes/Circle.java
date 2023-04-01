package com.flyweight.shapes;

public class Circle implements Shape{
    private String color;
    public Circle(String color) {
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle");
    }
}
