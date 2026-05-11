import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;

public class FileService {
    public static void saveReport(List<CarbonFootprint> items, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (CarbonFootprint item : items) {
                writer.println(item.getIdentification() + " | CO2 Footprint: " + item.getCarbonFootprint() + " kg");
            }
            System.out.println("\n[System] Report successfully saved to: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
