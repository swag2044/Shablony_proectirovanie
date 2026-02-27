import java.util.Scanner;

public class module_6_pr_main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TravelBookingContext context = new TravelBookingContext();

        System.out.println("Выберите транспорт: 1 - Самолет, 2 - Поезд, 3 - Автобус");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                context.setStrategy(new PlaneStrategy());
                break;
            case 2:
                context.setStrategy(new TrainStrategy());
                break;
            case 3:
                context.setStrategy(new BusStrategy());
                break;
            default:
                System.out.println("Неверный выбор");
                return;
        }

        TravelRequest request = new TravelRequest(
                1000,
                "Business",
                2,
                true,
                false,
                false
        );

        double result = context.calculate(request);
        System.out.println("Стоимость поездки: " + result);
    }
}