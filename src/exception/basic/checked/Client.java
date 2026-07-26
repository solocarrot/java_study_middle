package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{
        //던지거나 해결한다.
        //throw는 밠행시키기 throws는 던지기

        throw new MyCheckedException("ex");
    }
}
