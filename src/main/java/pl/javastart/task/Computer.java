package pl.javastart.task;

public class Computer {
    private Processor processor;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer(Processor processor, Memory memory, HardDrive hardDrive) {
        this.processor = processor;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void overclockProcessor() {
        processor.overclock();
    }

    public void overclockMemory() {
        memory.overclock();
    }

    public void memoryPrintInfo() {
        memory.printInfo();
    }

    public void processorPrintInfo() {
        processor.printInfo();
    }

    public void printInfo() {
        memoryPrintInfo();
        processorPrintInfo();
        hardDrive.printInfo();
    }
}