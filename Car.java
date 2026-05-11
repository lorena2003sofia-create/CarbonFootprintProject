public class Car implements CarbonFootprint {
    private final double gallonsConsumed;

    public Car(double gallonsConsumed) {
        this.gallonsConsumed = gallonsConsumed;
    }

    @Override
    public double getCarbonFootprint() {
        return gallonsConsumed * 8.8; 
    }

    @Override
    public String getIdentification() {
        return "Car with " + gallonsConsumed + " gallons consumed";
    }
}
