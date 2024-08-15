package LibraryManagmentSystem;

public class Book {
    private String title;
    private String subtitle;
    private static int bookCount = 0;

    public Book(String title){
        this.title = title;
        bookCount++;
    }
    public Book(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
        bookCount++;
    }
    public void display(){
        if(this.subtitle != null){
            System.out.println("Title: " + this.title);
            System.out.println("Subtitle: " + this.subtitle);
        }else{
            System.out.println("Title: " + this.title);
            System.out.println("");
        }
    }
    public static void getbookCount(){
        System.out.println("Total number of books created: " + bookCount);
    }
}
