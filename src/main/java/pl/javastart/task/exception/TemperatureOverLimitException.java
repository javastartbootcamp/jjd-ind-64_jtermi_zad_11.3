package pl.javastart.task.exception;

public class TemperatureOverLimitException extends ComputerException {
    public TemperatureOverLimitException() {
        super("Temperatura wykracza poza dozwolone granice bezpieczeństwa!");
    }
}
