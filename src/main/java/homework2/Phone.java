package homework2;

import homework2.phoneComponents.battery.PhoneBattery;

import java.time.LocalDateTime;
import java.util.*;

public class Phone implements MobileDevice {
    private static final int MAXIMUM_CHARACTERS_IN_MESSAGE = 500;
    private String manufacturer;
    private String color;
    private String material;
    private PhoneBattery battery;
    private Map<String, String> listOfContacts = new LinkedHashMap<>();
    private Map<String, List<String>> messagesToPhoneNumbers = new HashMap<>();
    private Map<LocalDateTime, String> phoneListHistory = new LinkedHashMap<>();

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setBattery(int batteryLife) {
        this.battery = new PhoneBattery(batteryLife);
    }

    public PhoneBattery getBattery() {
        return battery;
    }

    @Override
    public void addContact(String contactId, String phoneNumber, String firstName, String lastName) {
        System.out.println();
        listOfContacts.put(phoneNumber, firstName + " " + lastName);
        System.out.println("   ### Adding contacts: the Contact has been added to the phone: id = " + contactId + " and phone number = " + phoneNumber + " and name = " + firstName + " " + lastName);
    }

    @Override
    public void listContacts() {
        Set<String> phoneNumbers = listOfContacts.keySet();
        System.out.println();
        System.out.println("   ### The list of contacts is: ");
        if (listOfContacts.isEmpty()) {
            System.out.println("*** There are no contacts in the phone memory.");
        } else {
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber + " - " + listOfContacts.get(phoneNumber));
            }
        }
        System.out.println("The level of the battery in hours is ---> " + battery.getRemainingBatteryLife());
    }

    @Override
    public void sendMessages(String phoneNumber, String messageContent) {
        List<String> contents;
        System.out.println();
        System.out.println("   ### Sending a message to number " + phoneNumber);
        if (messageContent.length() <= MAXIMUM_CHARACTERS_IN_MESSAGE) {
            if (messagesToPhoneNumbers.containsKey(phoneNumber)) {
                messagesToPhoneNumbers.get(phoneNumber).add(messageContent);
            } else {
                contents = new ArrayList<>();
                contents.add(messageContent);
                messagesToPhoneNumbers.put(phoneNumber, contents);
            }
            if (battery != null) {
                battery.drainingBatteryWithMessage();
            }
            System.out.println("*** The message has been sent ---> " + phoneNumber + " ---> " + messageContent);
        } else {
            System.out.println("The message has " + messageContent.length() + " characters and it has already exceeded the maximum limit of " + MAXIMUM_CHARACTERS_IN_MESSAGE + " characters.");
            System.out.println("In order to continue, please reduce it with at least " + (messageContent.length() - MAXIMUM_CHARACTERS_IN_MESSAGE) + " characters.");
            System.out.println("*** The message has not been sent !");
        }

    }

    @Override
    public void listMessages(String phoneNumber) {
        int numberOfMessagesSent;
        System.out.println();
        System.out.println("   ### List messages for phone number " + phoneNumber);
        if (messagesToPhoneNumbers.containsKey(phoneNumber)) {
            numberOfMessagesSent = messagesToPhoneNumbers.get(phoneNumber).size();
            System.out.println("*** There are " + numberOfMessagesSent + " messages sent sent to phone number " + phoneNumber);
            if (numberOfMessagesSent > 0) {
                for (String message : messagesToPhoneNumbers.get(phoneNumber)) {
                    System.out.println(message);
                }
            }
        } else {
            System.out.println("There are no messages sent to this phone number : " + phoneNumber);
        }
        System.out.println("The level of the battery in hours is ---> " + battery.getRemainingBatteryLife());
    }

    @Override
    public void phoneCall(String phoneNumber) {
        System.out.println();
        System.out.println("   ### Calling number " + phoneNumber);
        if (battery != null) {
            battery.drainingBatteryWithCall();
        }
        phoneListHistory.put(LocalDateTime.now(), phoneNumber);
    }

    @Override
    public void viewHistory() {
        Set<LocalDateTime> localDateTimeKeys = phoneListHistory.keySet();
        System.out.println();
        System.out.println("   ### Call history:");
        if (localDateTimeKeys.isEmpty()) {
            System.out.println("*** There are no calls performed yet.");
        } else {
            for (LocalDateTime localDateTime : localDateTimeKeys) {
                System.out.println("*** " + localDateTime.toLocalDate() + " " + localDateTime.toLocalTime().withNano(0) + "   " + phoneListHistory.get(localDateTime));
            }
        }
        System.out.println("The level of the battery in hours is ---> " + battery.getRemainingBatteryLife());
    }


}
