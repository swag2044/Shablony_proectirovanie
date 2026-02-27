import java.util.Scanner;

public class MainStrategy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        System.out.println("Выберите способ оплаты:");
        System.out.println("1 - Банковская карта");
        System.out.println("2 - PayPal");
        System.out.println("3 - Криптовалюта");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                context.setStrategy(
                        new CreditCardPayment("1234-5678-0000", "Olzhas"));
                break;

            case 2:
                context.setStrategy(
                        new PayPalPayment("user@mail.com"));
                break;

            case 3:
                context.setStrategy(
                        new CryptoPayment("0xABCDEF123456"));
                break;

            default:
                System.out.println("Неверный выбор");
                return;
        }

        context.executePayment(500.0);
    }
}