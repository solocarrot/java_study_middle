package exception.basic.unchecked;

public class Client {
    public void call() {
        throw new InValidLanguageException("다른언어를 입력하셨습니다");
    }
}
