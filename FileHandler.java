import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;

public class FileService {
    public static void saveToFile(List<CarbonFootprint> items, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (CarbonFootprint item : items) {
                writer.println(item.toString() + " - CO2: " + item.getCarbonFootprint() + " kg");
            }
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}
