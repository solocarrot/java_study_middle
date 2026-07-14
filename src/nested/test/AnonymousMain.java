package nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
//        hello의 익명클래스를 생성하고 hello를 출력하려면 hello가 인터페이스형식이니까 먼저 ex뭐시기해줘서 클래스를만들고 거기서 출력하면?
        new Hello() {
            @Override
            public void hello() {
                System.out.println("hello.hello");
            }
        }.hello();
    }
}
