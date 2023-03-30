package pl.javastart.task.exception;

public class IllegalManufacturerDetailsExcerption extends ComputerException {
    public IllegalManufacturerDetailsExcerption() {
        super("Jedno lub więcej pół opisujących nazwę, producenta lub numer seryjny jest puste!");
    }
}
