package com.factory;

import com.factory.shapes.Circle;
import com.factory.shapes.Rectangle;
import com.factory.shapes.Shape;
import com.factory.shapes.ShapeType;

import java.lang.reflect.InvocationTargetException;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType){
        return switch (shapeType){
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
        };
    }
    public Shape createShapeByClassName(String className){
        try {
            // Get the class object for the specified class name
            Class<?> shapeClass = Class.forName(className);
            // Verify that the class implements the Shape interface
            if (!Shape.class.isAssignableFrom(shapeClass)) {
                throw new IllegalArgumentException("Class " + className + " does not implement Shape interface");
            }
            // Instantiate the class using its default constructor
            return (Shape) shapeClass.getDeclaredConstructor().newInstance();
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e){
            throw new IllegalArgumentException("Failed to create shape instance for class: ");
        }
    }
}
