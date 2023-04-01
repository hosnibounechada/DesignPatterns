package com.bridge.shapes;

import com.bridge.drawingapis.DrawingAPI;

public abstract class Shape {
    protected DrawingAPI drawingAPI;

    public Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }
    public abstract void draw();
}
