public class TravelRequest {

    private double distance;
    private String serviceClass; // Economy / Business
    private int passengers;
    private boolean hasLuggage;
    private boolean childDiscount;
    private boolean seniorDiscount;

    public TravelRequest(double distance, String serviceClass,
                         int passengers, boolean hasLuggage,
                         boolean childDiscount, boolean seniorDiscount) {
        this.distance = distance;
        this.serviceClass = serviceClass;
        this.passengers = passengers;
        this.hasLuggage = hasLuggage;
        this.childDiscount = childDiscount;
        this.seniorDiscount = seniorDiscount;
    }

    public double getDistance() { return distance; }
    public String getServiceClass() { return serviceClass; }
    public int getPassengers() { return passengers; }
    public boolean hasLuggage() { return hasLuggage; }
    public boolean isChildDiscount() { return childDiscount; }
    public boolean isSeniorDiscount() { return seniorDiscount; }
}