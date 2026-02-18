package module_4.module_4_homework;

public public class Bus implements IVehicle {

    private int passengerCapacity;
    private String fuelType;

    public Bus(int passengerCapacity, String fuelType) {
        this.passengerCapacity = passengerCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void drive() {
        System.out.println("Bus with capacity " + passengerCapacity + " passengers is driving.");
    }

    @Override
    public void refuel() {
        System.out.println("Bus refueled with " + fuelType);
    }
}
 {
    
}
