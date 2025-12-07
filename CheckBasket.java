public class CheckBasket {
    private final PaymentInterface paymentInterface;

    public CheckBasket(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void checkout(Basket basket) {
        if (basket.isEmpty()) {
            System.out.println("Корзина пуста. Пока!");
            return;
        }

        System.out.println("\n=== ТВОЯ КОРЗИНА ===");
        basket.getItems().forEach(item ->
                System.out.println(item.toBasketString()));

        double total = basket.calculateTotal();
        System.out.println("Всего: " + total + " руб");

        if (paymentInterface.processPayment(total)) {
            System.out.println("Спасибо за покупку!");
            basket.clear();
        } else {
            System.out.println("Заказ отменён");
        }
    }
}