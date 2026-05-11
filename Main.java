 import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CarbonFootprint> list = new ArrayList<>();

        list.add(new Building(3000.0));
        list.add(new Car(12.0));
        list.add(new Bicycle("Trek"));

        for (CarbonFootprint item : list) {
            System.out.println(item.toString() + " | CO2: " + item.getCarbonFootprint() + " kg");
        }

        FileHandler.saveToFile(list, "carbon_data.txt");
    }
}
