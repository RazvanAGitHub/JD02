package homework2.modelOfManufacturer.modelSamsung;

import homework2.manufacturer.Samsung;

public class SamsungGalaxyS6 extends Samsung {
    private String name;
    private static final int batteryLasting4Years = 35_040;

    public SamsungGalaxyS6(String color, String material, String name) {
        super(color, material);
        this.name = name;
    }

    public SamsungGalaxyS6() {
        this("black", "glass", "Samsung Galaxy S6 G920F");
        setBattery(batteryLasting4Years);
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryLasting4Years() {
        return batteryLasting4Years;
    }

    public String toString() {
        return getManufacturer() + ", " + name + ", " + getColor() + ", " + getMaterial() + ", the initial battery capacity is " + this.getBattery().getRemainingBatteryLife() + " hours.";
    }
}
