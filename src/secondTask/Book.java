package secondTask;

public abstract class Book {
    private String author;

    public Book(String author) {
        this.author = author;
    }

    abstract Book getBook();
    abstract String getTitle();


    public String toString() {
        return author + ": \"" + getTitle() + "\"";
    };
}
