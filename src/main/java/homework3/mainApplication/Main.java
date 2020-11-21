package homework3.mainApplication;

import homework3.model.*;
import homework3.location.Address;
import homework3.location.Continent;
import homework3.location.Country;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Razvan", "Pop", 30);
        //Person p4 = new Person("Razvan", "Pop", 30); //to check if you can have 2 persons in the HashMap if you override equals() and hashCode()
        Person p2 = new Student("Ana", "Pop", 18, "UTCN");
        Person p3 = new Employee("Marius", "Benaru", 40, "MSG", 5000);


        System.out.println("************************** Requirement 1 **************************");
        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(p1);
        listOfPersons.add(p2);
        listOfPersons.add(p3);
        System.out.println("The list of persons without any sorting: ");
        for (Person person : listOfPersons) {
            System.out.println(person);
        }

        Set<Person> persons = new TreeSet<>(new SortPersonsByName());
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        System.out.println();
        System.out.println("Ordered by name:");
        for (Person person : persons) {
            System.out.println(person);
        }

        Set<Person> personsOrderdByAge = new TreeSet<>(new SortPersonsByAge());
        personsOrderdByAge.add(p1);
        personsOrderdByAge.add(p2);
        personsOrderdByAge.add(p3);
        System.out.println();
        System.out.println("Ordered by age:");
        for (Person person : personsOrderdByAge) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("************************** Requirement 2 **************************");
        Country australia = new Country("Australia", Continent.AUSTRALIA);
        Country usa = new Country("USA", Continent.AMERICA_NORTH);
        Country italy = new Country("Italy", Continent.EUROPE);
        Country austria = new Country("Austria", Continent.EUROPE);

        Address surfingFirstAdress = new Address(australia, "Melbourne");
        Address surfingSecondAdress = new Address(usa, "Miamai");
        Address skiingFirstAdress = new Address(italy, "Valgardena");
        Address skiingSecondAdress = new Address(austria, "Ischgl");

        Address cyclingFirstAdress = surfingFirstAdress;
        Address cyclingSecondAdress = surfingSecondAdress;
        Address cyclingThirdAdress = skiingFirstAdress;

        List<Address> surfingAddresses = new ArrayList<>();
        surfingAddresses.add(surfingFirstAdress);
        surfingAddresses.add(surfingSecondAdress);

        List<Address> skiingAddresses = new ArrayList<>();
        skiingAddresses.add(skiingFirstAdress);
        skiingAddresses.add(skiingSecondAdress);

        List<Address> cyclingAddresses = new ArrayList<>();
        cyclingAddresses.add(cyclingFirstAdress);
        cyclingAddresses.add(cyclingSecondAdress);
        cyclingAddresses.add(cyclingThirdAdress);

        Hobby surfing = new Hobby("surfing", 2, surfingAddresses);
        Hobby skiing = new Hobby("skiing", 3, skiingAddresses);
        Hobby cycling = new Hobby("cycling", 5, cyclingAddresses);

        List<Hobby> hobbiesOfFirstPerson = new ArrayList<>();
        hobbiesOfFirstPerson.add(surfing);
        hobbiesOfFirstPerson.add(skiing);
        hobbiesOfFirstPerson.add(cycling);

        Map<Person, List<Hobby>> personsWithHobbies = new HashMap<>();
        personsWithHobbies.put(p1, hobbiesOfFirstPerson);
        //personsWithHobbies.put(p4, hobbiesOfFistPerson); //to check if you can have 2 persons in the HashMap if you override equals() and hashCode()

        printPersonsWithHobbies(personsWithHobbies);

        Hobby cyclingOtherFrequency = new Hobby("cycling", 7, cyclingAddresses);
        List<Hobby> hobbiesOfSecondPerson = new ArrayList<>();
        hobbiesOfSecondPerson.add(cyclingOtherFrequency);
        System.out.println("Adding another person with hobbies" + p3 + " --> ");
        personsWithHobbies.put(p3, hobbiesOfSecondPerson);

        printPersonsWithHobbies(personsWithHobbies);
    }

    private static void printPersonsWithHobbies(Map<Person, List<Hobby>> personsWithHobbies) {
        System.out.println("The number of persons with hobbies is: " + personsWithHobbies.size());
        Set<Person> personSet = personsWithHobbies.keySet();
        for (Person person : personSet) {
            System.out.println("Person " + person + " has following hobbies: ");
            for (Hobby hobby : personsWithHobbies.get(person)) {
                System.out.println("  * " + hobby.getName() + ", in countries: ");
                for (Address address : hobby.getListOfAddresses()) {
                    System.out.println("      " + address.getCountry());
                }
            }
        }
    }

}
