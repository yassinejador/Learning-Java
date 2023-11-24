public class Main {
    public static void main(String[] args) {
        Library library1=new Library();
        Author author1=new Author(1,"Amine");
        Book book1=new Book(1, "DSA1",author1);
        Book book2=new Book(2, "DSA2",author1);
        library1.addBook(book1);
        library1.addBook(book2);
        library1.removeBook(book1);
        System.out.println(book1.title);
    }
}