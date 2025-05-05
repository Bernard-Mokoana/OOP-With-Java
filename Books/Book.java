import java.io.Serializable;

public abstract class Book implements SizeDetailable, Serializable {

    protected String title;
    protected String author;
    protected String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
