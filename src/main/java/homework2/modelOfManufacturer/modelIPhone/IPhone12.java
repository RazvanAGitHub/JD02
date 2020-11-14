package homework2.modelOfManufacturer.modelIPhone;

import homework2.manufacturer.IPhone;

public class IPhone12 extends IPhone {
    private String name;
    private static final int batteryLasting6Years = 52_560;

    public IPhone12(String color, String material, String name) {
        super(color, material);
        this.name = name;
        setBattery(batteryLasting6Years);
    }

    public IPhone12() {
        this("red", "glass", "IPhone 12");
        setBattery(batteryLasting6Years);
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryLasting6Years() {
        return batteryLasting6Years;
    }

    public String toString() {
        return getManufacturer() + ", " + name + ", " + getColor() + ", " + getMaterial() + ", the initial battery capacity is " + this.getBattery().getRemainingBatteryLife() + " hours.";
    }
}
