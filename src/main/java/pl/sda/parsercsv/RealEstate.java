package pl.sda.parsercsv;

import javafx.beans.property.StringProperty;

/**
 * @author fmucko
 */
public class RealEstate {
    private String street;
    private String city;
    private Integer zip;
    private String state;
    private Integer beds;
    private Integer baths;
    private Integer sq_ft;
    private String type;
    private String sale_date;
    private Integer price;
    private Double latitude;
    private Double longitude;

    public RealEstate(String singleData) {
        String[] elements = singleData.split(",");
        this.street = elements[0];
        this.city = elements[1];
        this.zip = Integer.parseInt(elements[2]);
        this.state = elements[3];
        this.beds = Integer.parseInt(elements[4]);
        this.baths = Integer.parseInt(elements[5]);
        this.sq_ft = Integer.parseInt(elements[6]);
        this.type = elements[7];
        this.sale_date = elements[8];
        this.price = Integer.parseInt(elements[9]);
        this.latitude = Double.parseDouble(elements[10]);
        this.longitude = Double.parseDouble(elements[11]);
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", state='" + state + '\'' +
                ", beds=" + beds +
                ", baths=" + baths +
                ", sq_ft=" + sq_ft +
                ", type='" + type + '\'' +
                ", sale_date='" + sale_date + '\'' +
                ", price=" + price +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
