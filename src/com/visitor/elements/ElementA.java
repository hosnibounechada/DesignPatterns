package com.visitor.elements;

import com.visitor.visitors.Visitor;

public class ElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String getName() {
        return "Element A";
    }
}
