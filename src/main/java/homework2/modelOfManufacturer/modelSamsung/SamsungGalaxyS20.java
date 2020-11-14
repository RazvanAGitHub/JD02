package homework2.modelOfManufacturer.modelSamsung;

import homework2.manufacturer.Samsung;

public class SamsungGalaxyS20 extends Samsung {
    private String name;
    private static final int batteryLasting5Years = 43_800;

    public SamsungGalaxyS20(String color, String material, String name) {
        super(color, material);
        this.name = name;
        setBattery(batteryLasting5Years);
    }

    public SamsungGalaxyS20() {
        this("cosmic grey", "glass", "Samsung Galaxy S20");
        setBattery(batteryLasting5Years);
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryLasting5Years() {
        return batteryLasting5Years;
    }


    public String toString() {
        return getManufacturer() + ", " + name + ", " + getColor() + ", " + getMaterial() + ", the initial battery capacity is " + this.getBattery().getRemainingBatteryLife() + " hours.";
    }
}