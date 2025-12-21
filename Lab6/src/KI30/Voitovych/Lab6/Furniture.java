package KI30.Voitovych.Lab6;

/**
 * Class representing furniture items
 */
public class Furniture extends HouseholdItem {
    private String material;

    /**
     * Constructor for Furniture
     * @param name Item name
     * @param price Item price
     * @param material Material type
     */
    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}
