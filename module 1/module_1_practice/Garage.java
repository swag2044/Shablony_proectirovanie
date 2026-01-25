import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> vehicles = new ArrayList();

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        System.out.println(vehicle+" добавлен в гараж");
    }
    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
        System.out.println(vehicle+" удален из гаража");
    }

    public ArrayList<Vehicle> getVehicles(){
        return vehicles;
    }
    
}
