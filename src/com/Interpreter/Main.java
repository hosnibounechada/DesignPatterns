package com.Interpreter;

import com.Interpreter.expressions.AndExpression;
import com.Interpreter.expressions.Expression;
import com.Interpreter.expressions.OrExpression;
import com.Interpreter.expressions.TerminalExpression;

public class Main {
    public static void main(String[] args){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        Expression married = new TerminalExpression("married");
        Expression isMarried = new AndExpression(robert, married);
        Expression isSingle = new AndExpression(john, new OrExpression(new TerminalExpression("unmarried"), new TerminalExpression("single")));

        Context context1 = new Context("Robert is married");
        Context context2 = new Context("John is unmarried");
        Context context3 = new Context("Robert is single");

        System.out.println(isMarried.interpret(context1.getInput())); // true
        System.out.println(isMarried.interpret(context2.getInput())); // false
        System.out.println(isSingle.interpret(context1.getInput())); // false
        System.out.println(isSingle.interpret(context2.getInput())); // true
        System.out.println(isSingle.interpret(context3.getInput())); // false
    }
}
