public class Main {
    public static void main(String[] args) {
        // Создаем транспортные средства
        Vehicle car1 = new Car("Toyota", "Corolla", 2020, 4, "Automatic");
        Vehicle car2 = new Car("Honda", "Civic", 2019, 2, "Manual");
        Vehicle car3 = new Car("Volvo", "XC90", 2021, 4, "Automatic");

        // Создаем гаражи
        Garage garage1 = new Garage();
        Garage garage2 = new Garage();

        // Добавляем транспорт в гаражи
        garage1.addVehicle(car1);
        garage1.addVehicle(car2);
        garage2.addVehicle(car3);

        // Удаляем транспорт из гаража
        garage1.removeVehicle(car2);

        // Создаем автопарк
        Fleet fleet = new Fleet();

        // Добавляем гаражи в автопарк
        fleet.addGarage(garage1);
        fleet.addGarage(garage2);

        // Удаляем гараж из автопарка
        fleet.removeGarage(garage2);

        // Ищем транспорт по модели
        Vehicle found = fleet.findVehicle("Corolla");
    }
}
