package com.adapter;

public class RectangleAdapter implements Shape{
    private final LegacyRectangle legacyRectangle;
    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }
    @Override
    public void draw() {
        // Convert the Shape draw() method to the LegacyRectangle draw() method
        int x1 = 0;
        int y1 = 0;
        int x2 = 100;
        int y2 = 50;
        legacyRectangle.draw(x1, y1, x2, y2);
    }
}
