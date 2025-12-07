


public class Menu {
    private final ProductInterface productData; // DIP - зависит от интерфейса
    private final int exitCode;

    public Menu(ProductInterface productRepository, int exitCode) {
        this.productData = productRepository;
        this.exitCode = exitCode;
    }

    public void displayMenu() {
        System.out.println("\nСписок товаров:");
        productData.getAllProducts().forEach(System.out::println);
        System.out.println(exitCode + " - Выход");
    }
}