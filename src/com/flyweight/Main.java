package com.flyweight;

import com.flyweight.shapes.Circle;
import com.flyweight.shapes.Shape;

public class Main {
    public static void main(String[] args){
        Shape[] shapes = new Shape[]{
                ShapeFactory.getCircle("Red"),
                ShapeFactory.getCircle("Blue"),
                ShapeFactory.getCircle("Green"),
        };
        for(Shape shape : shapes) {
            shape.draw();
        }
    }
}
