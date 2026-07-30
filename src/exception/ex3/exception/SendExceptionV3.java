package exception.ex3.exception;

public class SendExceptionV3 extends Exception{
    private final String data;

    public SendExceptionV3(String data, String message) {
        super(message);
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
