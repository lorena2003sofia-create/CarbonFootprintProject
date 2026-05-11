public class Car implements CarbonFootprint {
    private double gallons;

    public Car(double gallons) {
        this.gallons = gallons;
    }

    @Override
    public double getCarbonFootprint() {
        return gallons * 8.8;
    }

    @Override
    public String toString() {
        return "Car [Fuel: " + gallons + " gallons]";
    }
}
