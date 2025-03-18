public class CD extends Item {
    private String artist;
    private int numberOfTracks;

    public CD(String itemId, String title, String publicationDate,
              String artist, int numberOfTracks) {
        super(itemId, title, publicationDate);
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
    }

    public String getArtist() {
        return artist;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    @Override
    public int getCheckoutDurationDays() {
        // Example: CDs can be checked out for 10 days
        return 10;
    }
}
