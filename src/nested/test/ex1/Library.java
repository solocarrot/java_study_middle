package nested.test.ex1;

public class Library {
    //addbook으로해서 메서드에있어야되는거고 건설자에는 숫자입력하면 그만큼의 북을 가지는 집합을 만들어야되는거잖아 그러면 라이브러리는 집합
    static class Book{
        String title;
        String author;
        void addBook(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
    Library(int N) {

    }

}
