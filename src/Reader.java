import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Reader {
    String line = "";
    String splitBy = ",";


    public void Read (List<Cuisines> cuisinesList) {

        try {
            FileReader reader = new FileReader("src/world_cuisines.csv");
            BufferedReader br = new BufferedReader(reader);
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] lineParts = line.split(splitBy);

                Cuisines cuisines = new Cuisines(lineParts[0].trim(), lineParts[1].trim(), lineParts[2].trim(),
                        Integer.parseInt(lineParts[3].trim()), Integer.parseInt(lineParts[4].trim()), lineParts[5].trim(),
                        Integer.parseInt(lineParts[6].trim()), Integer.parseInt(lineParts[7].trim()), lineParts[8].trim());
                cuisinesList.add(cuisines);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}