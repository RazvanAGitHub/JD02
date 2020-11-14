package homework2.phoneComponents.battery;

public class PhoneBattery extends Battery {
    private int remainingBatteryLife;
    private static final int BATTERY_DRAINING_MESSAGE = 1;
    private static final int BATTERY_DRAINING_CALL = 2;

    public PhoneBattery(int batteryLife) {
        this.remainingBatteryLife = batteryLife;
    }

    public int getRemainingBatteryLife() {
        return remainingBatteryLife;
    }

    @Override
    public void drainingBatteryWithMessage() {
        System.out.println("The Level of The Battery before sending the message was: " + remainingBatteryLife + " hours.");
        if (remainingBatteryLife >= BATTERY_DRAINING_MESSAGE) {
            remainingBatteryLife = remainingBatteryLife - BATTERY_DRAINING_MESSAGE;
            System.out.println("The Level of The Battery after sending the message is: " + remainingBatteryLife + " hours.");
        } else {
            System.out.println("The level of the battery is " + remainingBatteryLife + " hours and does not allow you to send a message!");
            System.out.println("*** The message has not been sent !");
            System.exit(0);
        }
    }

    @Override
    public void drainingBatteryWithCall() {
        System.out.println("The Level of The Battery before calling was: " + remainingBatteryLife + " hours.");
        if (remainingBatteryLife >= BATTERY_DRAINING_CALL) {
            remainingBatteryLife = remainingBatteryLife - BATTERY_DRAINING_CALL;
            System.out.println("The Level of The Battery after calling is: " + remainingBatteryLife + " hours.");
        } else {
            System.out.println("The level of the battery is " + remainingBatteryLife + " hours and does not allow you to send a call!");
            System.exit(0);
        }
    }
}
