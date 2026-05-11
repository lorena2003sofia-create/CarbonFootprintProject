public class Car implements CarbonFootprint {
    private final double gallons;

    public Car(double gallons) {
        this.gallons = gallons;
    }

    @Override
    public double getCarbonFootprint() {
        return gallons * 8.8;
    }

    @Override
    public String getIdentification() {
        return "Car [" + gallons + " gal]";
    }
}
