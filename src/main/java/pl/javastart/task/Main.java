package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        try {
            Memory memory = new Memory("IRDM", "GOODRAM", "090923487695", 16384, 3200, 60, 90);
            Processor processor = new Processor("I7", "INTEL", "68576653456", 5000, 55, 85);
            HardDrive hardDrive = new HardDrive("dysk", "WD", "123454545", 2048);

            Computer computer = new Computer(processor, memory, hardDrive);

            computer.processor.overclock();
            computer.processor.printInfo();
            computer.processor.overclock();
            computer.processor.printInfo();
            computer.processor.overclock();
            computer.processor.printInfo();
            computer.hardDrive.printInfo();

            computer.memory.overclock();
            computer.memory.printInfo();
            computer.memory.overclock();
            computer.memory.printInfo();

        } catch (Exception e) {
            System.err.println("\n" + e.getMessage());
        }
    }
}
