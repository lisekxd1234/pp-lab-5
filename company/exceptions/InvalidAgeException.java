package company.exceptions;

public class InvalidAgeException extends Exception {
    // konstruktor przyjmujący wiadomość jako argument
    public InvalidAgeException(String message) {
        super(message);
    }
}
