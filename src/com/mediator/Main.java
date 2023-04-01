package com.mediator;

import com.mediator.colleagues.Colleague1;
import com.mediator.colleagues.Colleague2;
import com.mediator.mediators.ConcreteMediator;

public class Main {
    public static void main(String[] args){
        ConcreteMediator mediator = new ConcreteMediator();
        Colleague1 colleague1 = new Colleague1(mediator);
        Colleague2 colleague2 = new Colleague2(mediator);
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.sendMessage("Hello from colleague1");
        colleague2.sendMessage("Hello from colleague2");
    }
}
