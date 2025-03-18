public abstract class Item {
    private String itemId;          // Unique identifier
    private String title;
    private String publicationDate; // Could be a String or a Date object

    public Item(String itemId, String title, String publicationDate) {
        this.itemId = itemId;
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Each subclass (Book, DVD, CD) will define how many days
     * the item can be checked out.
     */
    public abstract int getCheckoutDurationDays();
}
