import java.util.List;

public interface ProductInterface {
    List<Product> getAllProducts();
    Product getProductById(int id);
    boolean isValidProductId(int id);
}
