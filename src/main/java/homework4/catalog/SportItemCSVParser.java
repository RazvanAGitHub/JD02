package homework4.catalog;

import homework4.catalog.model.ItemSport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class SportItemCSVParser {
    public List<ItemSport> readFromFile(Reader reader) throws IOException, ValidationFormatSportItemException {
        List<ItemSport> sportItems = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(reader);

        System.out.println();
        System.out.println("*** Parsing the csv file.");
        int rowNumber = 1;
        String line = bufferedReader.readLine();
        while (line != null) {
            String[] tokens = line.split(",");

            if (tokens.length != 4) {
                throw new ValidationFormatSportItemException("The format of row number " + rowNumber + " is not valid. Please corect the file and then try again!");
            }

            ItemSport itemSport = new ItemSport(SportItemCategory.valueOf(tokens[0]), tokens[1], Integer.parseInt(tokens[2]), tokens[3]);

            sportItems.add(itemSport);

            line = bufferedReader.readLine();
            rowNumber++;

        }

        return sportItems;
    }
}
