public class TravelBookingContext {

    private ICostCalculationStrategy strategy;

    public void setStrategy(ICostCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(TravelRequest request) {

        if (strategy == null) {
            throw new IllegalStateException("Strategy not selected");
        }

        if (request.getDistance() <= 0 || request.getPassengers() <= 0) {
            throw new IllegalArgumentException("Invalid input data");
        }

        return strategy.calculateCost(request);
    }
}