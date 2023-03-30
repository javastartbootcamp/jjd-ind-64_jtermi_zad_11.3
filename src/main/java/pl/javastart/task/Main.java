package pl.javastart.task;

import pl.javastart.task.exception.ComputerException;

public class Main {

    public static void main(String[] args) {

        try {
            Memory memory = new Memory("IRDM", "GOODRAM", "090923487695", 16384, 3200, 60, 90);
            Processor processor = new Processor("I7", "INTEL", "68576653456", 5000, 55, 85);
            HardDrive hardDrive = new HardDrive("dysk", "WD", "123454545", 2048);

            Computer computer = new Computer(processor, memory, hardDrive);

            computer.overclockProcessor();
            computer.printInfo();
            computer.overclockProcessor();
            computer.printInfo();
            computer.overclockProcessor();
            computer.printInfo();
            computer.overclockProcessor();
            computer.overclockMemory();
            computer.overclockMemory();

        } catch (ComputerException e) {
            System.err.println("\n" + e.getMessage());
        }
    }
}
