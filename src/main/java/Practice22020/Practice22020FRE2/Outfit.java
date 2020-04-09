package Practice22020.Practice22020FRE2;

public class Outfit extends ClothingItem {
    private Shoe shoe;
    private Pants pants;
    private Top top;

    public Outfit(Shoe s, Pants p, Top t) {
        shoe = s;
        pants = p;
        top = t;
    }

    public String getTotalDescription() {
        return shoe.getDescription() + "/" + pants.getDescription() + "/" + top.getDescription() + " outfit";
    }

    public double getTotalPrice() {
        boolean exceeds100 = false;
        if (shoe.getPrice() + pants.getPrice() >= 100) {
            exceeds100 = true;
        }

        if (pants.getPrice() + top.getPrice() >= 100) {
            exceeds100 = true;
        }

        if (shoe.getPrice() + top.getPrice() >= 100) {
            exceeds100 = true;
        }

        double totalPrice = shoe.getPrice() + pants.getPrice() + top.getPrice();
        if (exceeds100) {
            return totalPrice * 0.75;
        } else {
            return totalPrice * 0.9;
        }
    }
}
