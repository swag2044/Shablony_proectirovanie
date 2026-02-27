public class BusStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {

        double baseRate = 0.1;
        double cost = request.getDistance() * baseRate;

        if (request.hasLuggage()) {
            cost += 10;
        }

        return cost * request.getPassengers();
    }
}