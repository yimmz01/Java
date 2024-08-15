package LibraryManagmentSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static Book getInfo() throws IOException {
        System.out.print("Enter details for a new book:");
        System.out.print("Title:");
        String title = br.readLine();
        System.out.print("Subtitle(or press Enter to skip): ");
        String subtitle = br.readLine();
        Book book;
        if(subtitle.isEmpty()) {
            book = new Book(title);
        }else{
            book = new Book(title, subtitle);
        }
        return book;
    }
    public static void main(String[] args) throws IOException {
        String answer ="";
        do{
            Book book = getInfo();
            Library.addBook(book);
            System.out.print("Do you want to enter another book?(yes/no):");
            answer = br.readLine();
        }while(answer.equalsIgnoreCase("yes"));
        Library.displayInfo();
        Book.getbookCount();
    }
}
