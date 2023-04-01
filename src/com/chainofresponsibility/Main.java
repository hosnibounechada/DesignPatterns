package com.chainofresponsibility;

import com.chainofresponsibility.loggers.ConsoleLogger;
import com.chainofresponsibility.loggers.ErrorLogger;
import com.chainofresponsibility.loggers.FileLogger;
import com.chainofresponsibility.loggers.Logger;

public class Main {
    public static void main(String[] args){
        Logger consoleLogger = new ConsoleLogger(Logger.DEBUG);
        Logger fileLogger = new FileLogger(Logger.INFO);
        Logger errorLogger = new ErrorLogger(Logger.ERROR);

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);

        consoleLogger.logMessage(Logger.INFO, "This is an information.");
        consoleLogger.logMessage(Logger.DEBUG, "This is a debug information.");
        consoleLogger.logMessage(Logger.ERROR, "This is an error information.");
    }
}
