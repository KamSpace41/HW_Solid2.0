import java.util.ArrayList;
import java.util.List;



public class Basket {
    private final List<Product> items = new ArrayList<>(); // OSP - можно добавить новые методы (например, applyDiscount()) без ломания старой логики
    public void addProduct(Product product) {
        items.add(product);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public List<Product> getItems() {
        return new ArrayList<>(items);
    }

    public double calculateTotal() {
        return items.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public void clear() {
        items.clear();
    }
}