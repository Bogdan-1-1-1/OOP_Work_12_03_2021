package secondTask;

public class MarkTwainBook extends Book{

    private String title;

    public MarkTwainBook(String title) {
        super("Mark Twain");
        this.title = title;
    }

    @Override
    Book getBook() {
        return new MarkTwainBook(getTitle());
    }

    @Override
    String getTitle() {
        return title;
    }
}
