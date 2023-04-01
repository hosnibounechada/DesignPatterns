package com.visitor.elements;

import com.visitor.visitors.Visitor;

public class ElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getValue() {
        return 42;
    }
}
