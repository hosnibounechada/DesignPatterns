package com.mediator.mediators;

import com.mediator.colleagues.Colleague;

public interface Mediator {
    void sendMessage(String message, Colleague colleague);
}
