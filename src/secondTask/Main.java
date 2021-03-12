package secondTask;

public class Main {
    public static void main(String[] args) {
        Book murdersAlphabetically = new AgathaChristieBook("murders alphabetically");
        Book tomSawyerAdventures = new MarkTwainBook("Tom Sawyer Adventures");

        System.out.println(murdersAlphabetically.toString());
        System.out.println(tomSawyerAdventures.toString());

        System.out.println();
        System.out.println(murdersAlphabetically.getBook().getTitle());
    }
}
