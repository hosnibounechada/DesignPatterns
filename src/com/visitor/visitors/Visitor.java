package com.visitor.visitors;

import com.visitor.elements.ElementA;
import com.visitor.elements.ElementB;

public interface Visitor {
    void visit(ElementA elementA);
    void visit(ElementB elementB);
}
