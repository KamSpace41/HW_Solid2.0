import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ProductData implements ProductInterface { // LSP - можно заменить на другой класс, реализующий ProductInterface
    private final List<Product> products;

    public ProductData() {
        products = Arrays.asList(
                new Product(1, "Хлеб", 100),
                new Product(2, "Молоко", 150),
                new Product(3, "Яйца", 200),
                new Product(4, "Яблоки", 120.12),
                new Product(5, "Бананы", 150.15),
                new Product(6, "Колбаса", 200.20),
                new Product(7, "Сыр", 250.25),
                new Product(8, "Вино", 300.30),
                new Product(9, "Шоколад", 350.35),
                new Product(10, "Печенье", 122.50),
                new Product(11, "Кофе", 450.21),
                new Product(12, "Чай", 120.12)
        );
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    @Override
    public Product getProductById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean isValidProductId(int id) {
        return id >= 1 && id <= products.size();
    }
}