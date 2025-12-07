import java.util.Scanner;


// SRP - Класс для ввода данных, если изменится формат ввода, то менять только здесь
public class Input {
    private final Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getChoice() {
        System.out.print("Выбери товар: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}