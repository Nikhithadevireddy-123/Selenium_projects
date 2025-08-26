package Day_9;

import java.util.*;

class Book implements Comparable<Book> {
    int bookId;
    String title;

    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }
    public int compareTo(Book bb) {
        return Integer.compare(bb.bookId, this.bookId); // Reverse
    }
    public String toString() {
        return bookId + " = " + title;
    }
}
public class BookSortDescending {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(102, "selenium"));
        books.add(new Book(105, "java"));
        books.add(new Book(101, "maven"));

        Collections.sort(books); 

        for (Book bb : books) {
            System.out.println(bb);
        }
    }
}

