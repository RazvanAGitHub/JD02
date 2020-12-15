package homework4.catalog.model;

import homework4.catalog.SportItemCategory;

import java.util.List;

public interface CrudCatalog {
    /**
     * Method createSportItem() creates a new sport item to the list of sport items.
     *
     * @param sportItemCategory
     * @param name
     * @param size
     * @param color
     */
    void createSportItem(SportItemCategory sportItemCategory, String name, int size, String color);

    /**
     * Method readAllSportItems() returns the list with all sport items.
     *
     * @return
     */
    List<ItemSport> readAllSportItems();

    /**
     * Method updateColorOfSportItem() updates the color of the sport item with the specified index.
     *
     * @param index
     * @param newColor
     */
    void updateColorOfSportItem(int index, String newColor);

    /**
     * Method deleteSportItem() deletes the sport item with the specified index.
     *
     * @param index
     */
    void deleteSportItem(int index);
}
