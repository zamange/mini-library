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

    public String searchByTitle(String title){
        if (books.contains(title)){
            return ;
        }
    }
}
