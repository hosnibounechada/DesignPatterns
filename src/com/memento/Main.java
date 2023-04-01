package com.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento(originator.saveStateToMemento());
        originator.setState("State3");
        caretaker.addMemento(originator.saveStateToMemento());
        originator.setState("State4");

        System.out.println("Current state: " + originator.getState());

        originator.getStateFromMemento(caretaker.getMemento(1));

        System.out.println("Restored state: " + originator.getState());
    }
}
