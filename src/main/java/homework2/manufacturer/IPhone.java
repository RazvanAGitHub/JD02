package homework2.manufacturer;

import homework2.Phone;

public class IPhone extends Phone {

    public IPhone(String color, String material) {
        super.setManufacturer("IPhone");
        super.setColor(color);
        super.setMaterial(material);
    }

}
