package generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
        Integer result = integerBox.get();
        System.out.println("result = " + result);


    }
}
