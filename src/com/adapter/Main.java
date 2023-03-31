package com.adapter;

public class Main {
    public static void main(String[] args){
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        Shape rectangle = new RectangleAdapter(legacyRectangle);
        rectangle.draw(); // outputs: "Drawing rectangle with legacy API: (0, 0) to (100, 50)"
    }
}
