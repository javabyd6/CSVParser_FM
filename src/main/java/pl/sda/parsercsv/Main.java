package pl.sda.parsercsv;

import java.io.IOException;

/**
 * @author fmucko
 */
public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        try {
            parser.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
