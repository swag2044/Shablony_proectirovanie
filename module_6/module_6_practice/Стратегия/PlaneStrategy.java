public class PlaneStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {

        double baseRate = 0.5;
        double cost = request.getDistance() * baseRate;

        if (request.getServiceClass().equalsIgnoreCase("Business")) {
            cost *= 1.5;
        }

        if (request.hasLuggage()) {
            cost += 30;
        }

        cost = applyDiscounts(cost, request);

        return cost * request.getPassengers();
    }

    private double applyDiscounts(double cost, TravelRequest request) {
        if (request.isChildDiscount()) cost *= 0.7;
        if (request.isSeniorDiscount()) cost *= 0.8;
        return cost;
    }
}