package com.command.commands;

import com.command.Calculator;

public class SubtractCommand implements Command{
    private final Calculator calculator;
    private final int operand;

    public SubtractCommand(Calculator calculator, int operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        calculator.subtract(operand);
    }
}
