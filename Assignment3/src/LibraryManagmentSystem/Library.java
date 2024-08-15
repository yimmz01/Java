package LibraryManagmentSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> books = new ArrayList<>();

    public static void addBook(Book book) {
        books.add(book);
    }
    public static void displayInfo(){
        System.out.println("Library Inventory:");
        for (Book book : books) {
            book.display();
        }
    }
}
