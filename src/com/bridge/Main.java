package com.bridge;

import com.bridge.drawingapis.DrawingAPI1;
import com.bridge.drawingapis.DrawingAPI2;
import com.bridge.shapes.Circle;
import com.bridge.shapes.Shape;

public class Main {
    public static void main(String[] args){
        Shape[] shapes = {
                new Circle(1,2,3,new DrawingAPI1()),
                new Circle(5,7,11,new DrawingAPI2()),
        };
        for(Shape shape : shapes){
            shape.draw();
        }
    }
}
