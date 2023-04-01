package com.flyweight;

import com.flyweight.shapes.Circle;
import com.flyweight.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a "+color+" Circle");
        }
        return circle;
    }
}
