public class TrainStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {

        double baseRate = 0.2;
        double cost = request.getDistance() * baseRate;

        if (request.getServiceClass().equalsIgnoreCase("Business")) {
            cost *= 1.3;
        }

        return cost * request.getPassengers();
    }
}