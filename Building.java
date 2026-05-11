public class Building implements CarbonFootprint {
    private final double kwhUsage;

    public Building(double kwhUsage) {
        this.kwhUsage = kwhUsage;
    }

    @Override
    public double getCarbonFootprint() {
        return kwhUsage * 0.5;
    }

    @Override
    public String getIdentification() {
        return "Building [" + kwhUsage + " kWh]";
    }
}
