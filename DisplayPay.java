import java.util.Scanner;

public class DisplayPay implements PaymentInterface {
    private final Scanner scanner;

    public DisplayPay(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.print("Оплатить " + amount + " руб? (да/нет): ");
        return scanner.nextLine().equalsIgnoreCase("да");
    }
}