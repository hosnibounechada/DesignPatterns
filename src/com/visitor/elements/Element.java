package com.visitor.elements;

import com.visitor.visitors.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
