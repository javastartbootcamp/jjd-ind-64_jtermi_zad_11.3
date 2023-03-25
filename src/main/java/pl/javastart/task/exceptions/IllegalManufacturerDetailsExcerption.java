package pl.javastart.task.exceptions;

public class IllegalManufacturerDetailsExcerption extends IllegalArgumentException {
    public IllegalManufacturerDetailsExcerption() {
        super("Jedno lub więcej pół opisujących nazwę, producenta lub numer seryjny jest puste!");
    }
}
