public class Main {
    public static void main(String[] args) {
        
        Vehicle car1 = new Car("Toyota", "Corolla", 2020, 4, "Automatic");
        Vehicle car2 = new Car("Honda", "Civic", 2019, 2, "Manual");
        Vehicle car3 = new Car("Volvo", "XC90", 2021, 4, "Automatic");

        
        Garage garage1 = new Garage();
        Garage garage2 = new Garage();

        
        garage1.addVehicle(car1);
        garage1.addVehicle(car2);
        garage2.addVehicle(car3);

        
        garage1.removeVehicle(car2);

        
        Fleet fleet = new Fleet();

        
        fleet.addGarage(garage1);
        fleet.addGarage(garage2);

        
        fleet.removeGarage(garage2);

        
        Vehicle found = fleet.findVehicle("Corolla");
    }
}
