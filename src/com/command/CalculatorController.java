package com.command;

import com.command.commands.Command;

public class CalculatorController {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
    }
}
