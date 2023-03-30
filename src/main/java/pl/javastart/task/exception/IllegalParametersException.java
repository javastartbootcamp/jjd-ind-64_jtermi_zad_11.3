package pl.javastart.task.exception;

public class IllegalParametersException extends ComputerException {
    public IllegalParametersException(String info) {
        super(info + "Jedno lub więcej pól opisujących parametry komponentu jest puste lub jest mniejsze/równe zero!");
    }
}
