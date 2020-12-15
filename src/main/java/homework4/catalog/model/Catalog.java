package homework4.catalog.model;


import homework4.catalog.SportItemCategory;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor

public class Catalog implements CrudCatalog {

    List<ItemSport> itemSportList = new ArrayList<>();

    @Override
    public void createSportItem(SportItemCategory sportItemCategory, String name, int size, String color) {
        System.out.println();
        System.out.println("*** Creating a sport item:");
        ItemSport sportItem = new ItemSport(sportItemCategory, name, size, color);
        itemSportList.add(sportItem);
        System.out.println("Sport Item has been created: " + sportItem);
    }

    @Override
    public List<ItemSport> readAllSportItems() {
        System.out.println();
        System.out.println("*** Reading the catalog:");
        if (itemSportList.isEmpty()) {
            System.out.println("The catalog is empty !!!");
        } else {
            System.out.println("The catalog has " + itemSportList.size() + " items:");
        }
        return itemSportList;
    }

    @Override
    @Deprecated
    public void updateColorOfSportItem(int index, String newColor) {
        System.out.println();
        System.out.println("*** Updating the catalog:");
        if (itemSportList.isEmpty()) {
            System.out.println("The catalog is empty !!!");
        } else {
            itemSportList.get(index).setColor(newColor);
            System.out.println("For the sport item with index " + index + " the color has changed to " + newColor);
        }
    }

    @Override
    public void deleteSportItem(int index) {
        System.out.println();
        System.out.println("*** Deleting a sport item:");
        if (index < itemSportList.size()) {
            itemSportList.remove(index);
            System.out.println("It was removed sport item with index " + index);
        } else {
            System.out.println("Please set the index between 0 and " + (itemSportList.size() - 1));
        }
    }
}
