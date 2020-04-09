package Practice22020.Practice22020FRE2;

public class ClothingItem {
    private String description;
    private double price;

    public ClothingItem() {
        description = "";
        price = 0;
    }

    public ClothingItem(String descr, double aPrice) {
        description = descr;
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
