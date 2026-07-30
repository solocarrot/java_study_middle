package exception.ex4.exception;

public class SendException extends RuntimeException{
    private final String sendData;

    public SendException(String message, String sendData) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
