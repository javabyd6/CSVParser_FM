package pl.sda.parsercsv;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

/**
 * @author fmucko
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        List<RealEstate> realEstates = parser.readFile(Paths.get("fileTmp.csv"));

        Map<String, List<RealEstate>> realEstateMap = parser.groupByCity(realEstates);

        System.out.println(realEstateMap.keySet().toString());
        parser.avgPrice(realEstates);

    }

}
