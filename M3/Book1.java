public class Book extends Item {
    private String author;
    private int numberOfPages;

    public Book(String itemId, String title, String publicationDate,
                String author, int numberOfPages) {
        super(itemId, title, publicationDate);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public int getCheckoutDurationDays() {
        // Example: Books can be checked out for 14 days
        return 14;
    }
}
