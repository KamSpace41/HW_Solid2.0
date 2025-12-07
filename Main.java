import java.util.Scanner;



public class Main {
    private static final int EXIT_CODE = 0; // Константа для выхода из магазина

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductInterface productData = new ProductData();
        Basket basket = new Basket();
        Menu menu = new Menu(productData, EXIT_CODE);
        Input input = new Input(scanner);
        PaymentInterface paymentInterface = new DisplayPay(scanner);
        CheckBasket checkoutBasket = new CheckBasket(paymentInterface);


        runShop(productData, basket, menu, input, checkoutBasket, scanner);

        scanner.close();
    }

    private static void runShop(ProductInterface productData,
                                Basket basket,
                                Menu menu,
                                Input input,
                                CheckBasket checkoutBasket, Scanner scanner) {
        System.out.println("=== МАГАЗИН ===");

        while (true) {
            menu.displayMenu();
            int choice = input.getChoice();

            if (choice == EXIT_CODE) {
                checkoutBasket.checkout(basket);
                break;
            }

            if (productData.isValidProductId(choice)) { // DRY - productData.isValidProductId(choice) вместо if (choice >= 1 && choice <= 12)
                Product product = productData.getProductById(choice);
                basket.addProduct(product);
                System.out.println(product.getName() + " добавлен в корзину!");
            } else {
                System.out.println("Неверный выбор!");
            }
        }
    }
}