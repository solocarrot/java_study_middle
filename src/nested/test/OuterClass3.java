package nested.test;

public class OuterClass3 {
    public void myMethod () {
        class LocalClass {
            public void hello() {
//                outerclass.mymethod만해도 hello가 출력이 되게끔해야되니까. 메서드안에 클래스가있는거고
//                그클래스안에 또 HELLO라는 메서드가있는데 이걸 호출하지않아도 안에 내용이 출력이될수있는건가? 엥
                System.out.println("localclass.hello");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
