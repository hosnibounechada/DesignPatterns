package com.observer;

public class Main {
    public static void main(String[] args){
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver("Hosni");
        Observer observer2 = new ConcreteObserver("Marwan");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifyObservers();

        subject.removeObserver(observer1);
        subject.notifyObservers();
    }
}
