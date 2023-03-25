package pl.javastart.task;

public class Computer {
    Processor processor;
    Memory memory;
    HardDrive hardDrive;

    public Computer(Processor processor, Memory memory, HardDrive hardDrive) {
        this.processor = processor;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
}