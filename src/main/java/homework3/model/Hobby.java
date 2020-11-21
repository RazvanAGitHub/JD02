package homework3.model;

import homework3.location.Address;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    private List<Address> listOfAddresses =  new ArrayList<>();

    public Hobby(String name, int frequency, List<Address> listOfAddresses) {
        this.name = name;
        this.frequency = frequency;
        this.listOfAddresses = listOfAddresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Address> getListOfAddresses() {
        return listOfAddresses;
    }

    public void setListOfAddresses(List<Address> listOfAddresses) {
        this.listOfAddresses = listOfAddresses;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", listOfAddresses=" + listOfAddresses +
                '}';
    }
}
