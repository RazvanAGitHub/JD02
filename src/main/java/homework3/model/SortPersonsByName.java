package homework3.model;

import homework3.model.Person;

import java.util.Comparator;

class SortPersonsByName implements Comparator<Person> {
    public int compare(Person firstPerson, Person secondPerson) {
        String nameFirstPerson = firstPerson.getLastName() + firstPerson.getFirstName();
        String nameSecondPerson = secondPerson.getLastName() + secondPerson.getFirstName();
        return nameFirstPerson.compareTo(nameSecondPerson);
    }
}
