
public class Product {
    private final String name;
    private final double price;
    private final int id;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + price + " руб)";
    }

    public String toBasketString() {
        return name + " - " + price + " руб";
    }
}