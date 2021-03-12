package secondTask;

public class AgathaChristieBook extends Book{

    private String title;

    public AgathaChristieBook(String title) {
        super("Agatha Christie");
        this.title = title;
    }

    @Override
    Book getBook() {
        return new AgathaChristieBook(getTitle());
    }

    @Override
    String getTitle() {
        return title;
    }

}
