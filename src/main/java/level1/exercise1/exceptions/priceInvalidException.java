package level1.exercise1.exceptions;

public class priceInvalidException extends RuntimeException {
    public priceInvalidException(String message) {
        super(message);
    }
}
