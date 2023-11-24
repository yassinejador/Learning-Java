import java.util.ArrayList;
import java.util.List;

public class Library {
    public String libraryName;
    public List<Book> books=new ArrayList<>();
    void addBook(Book book) {
        this.books.add(book);
    }
    void removeBook(Book book) {
        books.remove(book);
    }
    void displayBooks() {
        for(Book book:books) {
            System.out.println("isbn : "+book.isbn);
            System.out.println("titre : "+book.title);
            System.out.println("author : "+book.author.authorName+"\n");
        }
    }
}
