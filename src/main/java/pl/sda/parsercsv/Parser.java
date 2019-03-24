package pl.sda.parsercsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author fmucko
 */
public class Parser {

    private Path file = Paths.get("SacramentoRE.csv");

    public void readFile() throws IOException {
        byte[] data = Files.readAllBytes(file);
        String convertData = new String(data);
        String[] dataArray = convertData.split("\\r");

        RealEstate[] realEstates = new RealEstate[dataArray.length-1];
        for (int i = 0; i < dataArray.length-1; i++) {
            realEstates[i] = new RealEstate(dataArray[i+1]);
        }

        System.out.println(realEstates.length);

    }


}
