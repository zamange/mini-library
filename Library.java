import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;


    //constructor

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook (Book book){
        books.add(book);
    }

    public void removeBook (Book book){
        books.remove(book);
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
