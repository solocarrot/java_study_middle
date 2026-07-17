package nested.test.ex1;

import java.util.Arrays;

public class Library {
    //addbook으로해서 메서드에있어야되는거고 건설자에는 숫자입력하면 그만큼의 북을 가지는 집합을 만들어야되는거잖아 그러면 라이브러리는 집합
    private Book[] books;
    private int bookcount;

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    Library(int N) {
        books = new Book[N];
        bookcount = 0;
        //4개짜리배열이니까 addbook이라는 메서드로 북카운트에해당하는 북배열에 북의 참조값을넣기
    }

    void addBook(String title, String author) {
        //이렇게 입력했을때 이게 새로운 Book이라는 클래스가 만들어져야되는거지?
        books[bookcount] = new Book(title, author);
        bookcount++;
    }

    void showBook() {
        System.out.println(books);
    }





    static class Book{
        String title;
        String author;
        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "도서이름: " + title + "저자: " + author;
        }
    }

}
