
import java.util.ArrayList;
import java.util.List;

public class Patron {
    private static final int MAX_ITEMS = 10;

    private String name;
    private String patronId;
    private List<Item> checkedOutItems;

    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.checkedOutItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPatronId() {
        return patronId;
    }

    public List<Item> getCheckedOutItems() {
        return checkedOutItems;
    }

    /**
     * Allows the patron to check out an item if they have
     * fewer than MAX_ITEMS already checked out.
     */
    public boolean checkOutItem(Item item) {
        if (checkedOutItems.size() >= MAX_ITEMS) {
            System.out.println("Cannot check out more than " + MAX_ITEMS + " items.");
            return false;
        }
        checkedOutItems.add(item);
        System.out.println("Checked out: " + item.getTitle());
        return true;
    }

    /**
     * Allows the patron to return an item, removing it from
     * the list of checked-out items.
     */
    public boolean returnItem(Item item) {
        if (checkedOutItems.remove(item)) {
            System.out.println("Returned: " + item.getTitle());
            return true;
        } else {
            System.out.println("Item not found in checked-out list.");
            return false;
        }
    }
}
