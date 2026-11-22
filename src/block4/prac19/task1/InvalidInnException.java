package block4.prac19.task1;

public class InvalidInnException extends Exception {

    private final String invalidInn;

    public InvalidInnException(String message, String invalidInn) {
        super(message);
        this.invalidInn = invalidInn;
    }

    public InvalidInnException(String message, String invalidInn, Throwable cause) {
        super(message, cause);
        this.invalidInn = invalidInn;
    }

    public String getInvalidInn() {
        return invalidInn;
    }
}
