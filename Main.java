import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CarbonFootprint> elements = new ArrayList<>();

        // Creamos objetos de diferentes clases
        elements.add(new Building(2500.0));
        elements.add(new Car(12.5));
        elements.add(new Bicycle());

        System.out.println("--- GLOBAL CARBON FOOTPRINT REPORT ---");
        
        // Iteración polimórfica
        for (CarbonFootprint element : elements) {
            System.out.println(element.getIdentification());
            System.out.println("Emissions: " + element.getCarbonFootprint() + " kg of CO2\n");
        }

        // Persistencia en archivo
        FileService.saveReport(elements, "results.txt");
    }
}
