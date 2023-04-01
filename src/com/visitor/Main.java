package com.visitor;

import com.visitor.elements.Element;
import com.visitor.elements.ElementA;
import com.visitor.elements.ElementB;
import com.visitor.visitors.NameVisitor;
import com.visitor.visitors.ValueVisitor;
import com.visitor.visitors.Visitor;

public class Main {
    public static void main(String[] args){
        Element[] elements = {new ElementA(), new ElementB()};
        Visitor nameVisitor = new NameVisitor();
        Visitor valueVisitor = new ValueVisitor();

        for (Element element : elements) {
            element.accept(nameVisitor);
            element.accept(valueVisitor);
        }
    }
}
