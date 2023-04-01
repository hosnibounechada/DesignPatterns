package com.mediator.colleagues;

import com.mediator.mediators.Mediator;

public class Colleague1 extends Colleague {
    public Colleague1(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }
    @Override
    public void receiveMessage(String message) {
        System.out.println("Colleague1 received message: " + message);
    }
}
