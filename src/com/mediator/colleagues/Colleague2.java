package com.mediator.colleagues;

import com.mediator.mediators.Mediator;

public class Colleague2 extends Colleague {
    public Colleague2(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }
    @Override
    public void receiveMessage(String message) {
        System.out.println("Colleague2 received message: " + message);
    }
}
