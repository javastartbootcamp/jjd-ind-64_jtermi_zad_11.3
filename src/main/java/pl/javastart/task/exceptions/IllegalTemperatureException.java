package pl.javastart.task.exceptions;

public class IllegalTemperatureException extends IllegalArgumentException {
    public IllegalTemperatureException() {
        super("Temperatura robocza nie może być wyższa od temperatury maksymalnej!");
    }
}
