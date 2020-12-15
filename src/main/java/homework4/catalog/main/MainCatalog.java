package homework4.catalog.main;

import homework4.catalog.model.Catalog;
import homework4.catalog.model.ItemSport;
import homework4.catalog.SportItemCSVParser;
import homework4.catalog.ValidationFormatSportItemException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static homework4.catalog.SportItemCategory.SHOES;

public class MainCatalog {
    public static void main(String... args) {

        List<ItemSport> itemSportList = new ArrayList<>();

        try (Reader reader = new FileReader("sport_items.csv");) {
            SportItemCSVParser sportItemCSVParser = new SportItemCSVParser();
            itemSportList = sportItemCSVParser.readFromFile(reader);
        } catch (IOException | ValidationFormatSportItemException e) {
            System.out.println(e.getMessage());
        }

        Catalog catalog = new Catalog(itemSportList);
        System.out.println(catalog.readAllSportItems());

        catalog.createSportItem(SHOES, "Puma", 43, "W");
        System.out.println(catalog.readAllSportItems());

        catalog.deleteSportItem(2);
        System.out.println(catalog.readAllSportItems());

        catalog.updateColorOfSportItem(0, "MAGENTA");
        System.out.println(catalog.readAllSportItems());

        String nameOfTheFileWithSerialization = "sport_items_serialized.obj";
        SerializationOfSportItems(itemSportList, nameOfTheFileWithSerialization);
        // External - Deserialization
        DeserializationOfSportItems(nameOfTheFileWithSerialization);

    }

    public static void SerializationOfSportItems(List<ItemSport> itemSportList, String nameOfTheFileWithSerialization) {
        System.out.println();
        try {
            System.out.println("*** Serialization of " + itemSportList.size() + " sport items: " + itemSportList);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nameOfTheFileWithSerialization));
            objectOutputStream.writeObject(itemSportList);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void DeserializationOfSportItems(String nameOfTheFileWithSerialization) {
        System.out.println();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nameOfTheFileWithSerialization));
            Object objectValue = objectInputStream.readObject();
            List<ItemSport> itemSportListDeserialized = (List<ItemSport>) objectValue;
            System.out.println("*** Deserialization of " + itemSportListDeserialized.size() + " sport items: " + itemSportListDeserialized);
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
