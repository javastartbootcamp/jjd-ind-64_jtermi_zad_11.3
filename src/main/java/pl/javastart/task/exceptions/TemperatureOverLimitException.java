package pl.javastart.task.exceptions;

public class TemperatureOverLimitException extends IllegalArgumentException {
    public TemperatureOverLimitException() {
        super("Temperatura wykracza poza dozwolone granice bezpieczeństwa!");
    }
}
