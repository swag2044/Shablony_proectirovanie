import java.util.Scanner;

public class Main_module_4_hw {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VehicleFactory factory = null;

        System.out.println("Choose vehicle type: 1-Car, 2-Motorcycle, 3-Truck, 4-Bus");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Brand: ");
                String brand = scanner.nextLine();

                System.out.print("Model: ");
                String model = scanner.nextLine();

                System.out.print("Fuel type: ");
                String fuel = scanner.nextLine();

                factory = new CarFactory(brand, model, fuel);
                break;

            case 2:
                System.out.print("Type: ");
                String type = scanner.nextLine();

                System.out.print("Engine capacity: ");
                int engine = scanner.nextInt();

                factory = new MotorcycleFactory(type, engine);
                break;

            case 3:
                System.out.print("Load capacity: ");
                double capacity = scanner.nextDouble();

                System.out.print("Axles: ");
                int axles = scanner.nextInt();

                factory = new TruckFactory(capacity, axles);
                break;

            case 4:
                System.out.print("Passenger capacity: ");
                int passengers = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Fuel type: ");
                String busFuel = scanner.nextLine();

                factory = new BusFactory(passengers, busFuel);
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        IVehicle vehicle = factory.createVehicle();
        vehicle.drive();
        vehicle.refuel();
    }
}
