public interface CarbonFootprint {
    // Alta cohesión: Solo se encarga de definir el comportamiento de huella
    double getCarbonFootprint();
    String getIdentification();
}
