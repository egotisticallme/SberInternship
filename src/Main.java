import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<City> cities = csvReader("/Users/malievilya/Desktop/spreadsheet.csv");

        for (City city : cities) {
            System.out.println(city);
        }
    }
    private static List<City> csvReader(String fileName){
        ArrayList<City> cities = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String parts[] = line.split(";");
                String values[] = new String[parts.length - 1];
                for (int i = 1; i <= values.length; i++) {
                    values[i - 1] = parts[i];
                }
                cities.add(new City(values));
            }
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        return cities;
    }
}