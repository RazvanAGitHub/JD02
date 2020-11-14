package homework2.application;

import homework2.Phone;
import homework2.modelOfManufacturer.modelIPhone.IPhone12;
import homework2.modelOfManufacturer.modelIPhone.IPhone7;
import homework2.modelOfManufacturer.modelSamsung.SamsungGalaxyS20;
import homework2.modelOfManufacturer.modelSamsung.SamsungGalaxyS6;

public class MobilePhoneOperations {

    public static void main(String[] args) {
        //Phone phone = new Samsung(); //not compiling
        Phone phone = new SamsungGalaxyS6();
        Phone phoneS20 = new SamsungGalaxyS20();
        Phone iPhone7 = new IPhone7();
        Phone iPhone12 = new IPhone12();


        phone.listContacts();
        phone.addContact("1", "0700 111 111", "Mircea", "Pop");
        phone.addContact("2", "0700 222 222", "Gelu", "Popa");
        phone.listContacts();

        phone.listMessages("0700 111 111");
        phone.sendMessages("0700 111 111", "Salut, ce mai faci?");
        phone.sendMessages("0700 111 111", "Cand ne vedem?");
        phone.listMessages("0700 111 111");

        phone.listMessages("0700 222 222");
        phone.sendMessages("0700 222 222", "OK");
        phone.sendMessages("0700 222 222", "Not OK");

        phone.sendMessages("0700 333 333", "great");

        phone.listMessages("0700 222 222");

        phone.listMessages("0700 111 111");

        phone.listMessages("0700 333 333");

        //Normally it should pass some seconds between making calls, otherwise in the scenario below it possible not to display correctly the call history because they are almost made in the same time
        phone.viewHistory();
        phone.phoneCall("0700 222 222");
        phone.viewHistory();
        phone.phoneCall("0700 222 222");
        phone.viewHistory();
        phone.phoneCall("0700 111 111");
        phone.viewHistory();

        //testing the limit of maximum 500 characters in a message
        phone.sendMessages("0700 111 111", "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij12345");

        phoneS20.listContacts();
        iPhone7.listMessages("00000");
        iPhone12.viewHistory();
    }
}
