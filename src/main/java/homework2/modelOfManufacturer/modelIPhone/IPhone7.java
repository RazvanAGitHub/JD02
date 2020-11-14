package homework2.modelOfManufacturer.modelIPhone;

import homework2.manufacturer.IPhone;

public class IPhone7 extends IPhone {
    private String name;
    private static final int batteryLasting5Years = 43_800;

    public IPhone7(String color, String material, String name) {
        super(color, material);
        this.name = name;
        setBattery(batteryLasting5Years);
    }

    public IPhone7() {
        this("black", "aluminium", "IPhone 7");
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
