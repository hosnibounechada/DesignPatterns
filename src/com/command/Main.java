package com.command;

import com.command.commands.AddCommand;
import com.command.commands.Command;
import com.command.commands.SubtractCommand;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        CalculatorController calculatorController = new CalculatorController();

        // Add 5 to the calculator
        Command addCommand = new AddCommand(calculator, 5);
        calculatorController.setCommand(addCommand);
        calculatorController.executeCommand();
        System.out.println("Result: " + calculator.getResult());

        // Subtract 3 from the calculator
        Command subtractCommand = new SubtractCommand(calculator, 3);
        calculatorController.setCommand(subtractCommand);
        calculatorController.executeCommand();
        System.out.println("Result: " + calculator.getResult());
    }
}
