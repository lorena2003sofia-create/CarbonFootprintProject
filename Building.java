public class Building implements CarbonFootprint {
    private final double kwhUsage;

    public Building(double kwhUsage) {
        this.kwhUsage = kwhUsage;
    }

    @Override
    public double getCarbonFootprint() {
        return kwhUsage * 0.5; // Coeficiente específico
    }

    @Override
    public String getIdentification() {
        return "Building with " + kwhUsage + " kWh monthly usage";
    }
}
