public class DVD extends Item {
    private String director;
    private int runningTime; // in minutes

    public DVD(String itemId, String title, String publicationDate,
               String director, int runningTime) {
        super(itemId, title, publicationDate);
        this.director = director;
        this.runningTime = runningTime;
    }

    public String getDirector() {
        return director;
    }

    public int getRunningTime() {
        return runningTime;
    }

    @Override
    public int getCheckoutDurationDays() {
        // Example: DVDs can be checked out for 7 days
        return 7;
    }
}
