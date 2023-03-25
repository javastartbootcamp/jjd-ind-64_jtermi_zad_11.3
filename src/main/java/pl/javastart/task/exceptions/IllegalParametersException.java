package pl.javastart.task.exceptions;

public class IllegalParametersException extends IllegalArgumentException {
    public IllegalParametersException() {
        super("Jedno lub więcej pól opisujących parametry komponentu jest puste lub jest mniejsze/równe zero!");
    }
}
