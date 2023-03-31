package com.command.commands;

import com.command.Calculator;

public class AddCommand implements Command{
    private final Calculator calculator;
    private final int operand;
    public AddCommand(Calculator calculator, int operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        calculator.add(operand);
    }
}
