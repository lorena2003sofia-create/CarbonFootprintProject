public class Bicycle implements CarbonFootprint {
    @Override
    public double getCarbonFootprint() {
        return 0.0;
    }

    @Override
    public String getIdentification() {
        return "Bicycle [Eco-friendly]";
    }
}
