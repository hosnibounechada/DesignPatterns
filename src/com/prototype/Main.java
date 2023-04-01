package com.prototype;

import com.prototype.shapes.Shape;

public class Main {
    public static void main(String[] args){
        ShapeCache.loadShape();

        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
    }
}
