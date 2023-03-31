package com.factory;

import com.factory.shapes.Circle;
import com.factory.shapes.Shape;
import com.factory.shapes.ShapeType;
import com.factory.shapes.Triangle;

public class Main {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        // Create Shape using Enum and Switch statement
        Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
        rectangle.draw();
        // Create Shape directly by its Class Name
        Shape circle = shapeFactory.createShapeByClassName(Circle.class.getName());
        circle.draw();
        //Throws Exception because Triangle class does not implement Shape interface
        Shape triangle = shapeFactory.createShapeByClassName(Triangle.class.getName());
        triangle.draw();
    }
}
