public class Bicycle implements CarbonFootprint {
    private String brand;

    public Bicycle(String brand) {
        this.brand = brand;
    }

    @Override
    public double getCarbonFootprint() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Bicycle [Brand: " + brand + "]";
    }
}
