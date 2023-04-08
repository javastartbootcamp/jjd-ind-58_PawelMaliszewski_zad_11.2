package pl.javastart.task;

public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException(String message) {
        super(message);
    }
}
