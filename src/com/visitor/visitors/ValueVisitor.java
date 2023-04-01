package com.visitor.visitors;

import com.visitor.elements.ElementA;
import com.visitor.elements.ElementB;

public class ValueVisitor implements Visitor{
    @Override
    public void visit(ElementA elementA) {
        System.out.println("Visited Element B");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("Visited " + elementB.getValue());
    }
}
