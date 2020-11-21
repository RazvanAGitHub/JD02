package homework3.location;

import homework3.location.Continent;

public class Country {
    private String name;
    private Continent continent;

    public Country(String name, Continent continent) {
        this.name = name;
        this.continent = continent;
    }

    public Continent getContinent() {
        return continent;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
