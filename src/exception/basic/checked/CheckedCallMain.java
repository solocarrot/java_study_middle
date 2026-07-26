package exception.basic.checked;

public class CheckedCallMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.catchThrow();
    }
}
