package pl.sda.parsercsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * @author fmucko
 */
public class Parser {

    public List<RealEstate> readFile(Path path) throws IOException {
        //SPOSÓB readAllLines
        List<String> dataList = new ArrayList<>();
        dataList.addAll(Files.readAllLines(path));
        dataList.remove(0);
        List<RealEstate> realEstates = new ArrayList<>();

        dataList.stream().forEach(d -> realEstates.add(new RealEstate(d)));

        /* SPOSÓB readAllBytes
        byte[] data = Files.readAllBytes(file);
        String convertData = new String(data);
        String[] dataArray = convertData.split("\\r");

        RealEstate[] realEstates = new RealEstate[dataArray.length-1];
        for (int i = 0; i < dataArray.length-1; i++) {
            realEstates[i] = new RealEstate(dataArray[i+1]);
        }
*/
        return realEstates;
    }

    public void avgPrice(List<RealEstate> realEstates) {
        Double avg_price = (realEstates.stream().mapToDouble(RealEstate::getPrice).sum()) / realEstates.size();
        System.out.println(avg_price);
    }

    public Map<String, List<RealEstate>> groupByCity(List<RealEstate> realEstates) {
        Map<String, List<RealEstate>> realEstatesMap = new HashMap<>();
        for (RealEstate realEstate : realEstates) {
            if (realEstatesMap.containsKey(realEstate.getCity())) {
                realEstatesMap.get(realEstate.getCity()).add(realEstate);
            } else {
                List<RealEstate> list = new ArrayList<>();
                list.add(realEstate);
                realEstatesMap.put(realEstate.getCity(), list);
            }
        }

        return realEstatesMap;
    }


}
