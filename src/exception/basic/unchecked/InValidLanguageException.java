package exception.basic.unchecked;

public class InValidLanguageException extends RuntimeException{
    InValidLanguageException(String message) {
        super (message);
    }
}
