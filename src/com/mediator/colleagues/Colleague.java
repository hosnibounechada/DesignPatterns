package com.mediator.colleagues;

import com.mediator.mediators.Mediator;

public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    abstract void sendMessage(String message);

    abstract void receiveMessage(String message);
}
