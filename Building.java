public class Building implements CarbonFootprint {
    private double squareFeet;

    public Building(double squareFeet) {
        this.squareFeet = squareFeet;
    }

    @Override
    public double getCarbonFootprint() {
        return squareFeet * 0.5;
    }

    @Override
    public String toString() {
        return "Building [Area: " + squareFeet + " sq ft]";
    }
}
