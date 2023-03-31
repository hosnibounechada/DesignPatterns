package com.facade;

import com.facade.components.CPU;
import com.facade.components.HardDrive;
import com.facade.components.Memory;

public class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;
    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }
    public void start() {
        hardDrive.readData();
        memory.load();
        cpu.processData();
        System.out.println("Computer started!");
    }
}
