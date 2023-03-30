package pl.javastart.task.exception;

public class IllegalTemperatureException extends ComputerException {
    public IllegalTemperatureException(String info) {
        super(info + "Temperatura robocza nie może być wyższa od temperatury maksymalnej!");
    }
}
