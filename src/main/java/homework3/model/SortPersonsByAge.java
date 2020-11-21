package homework3.model;

import homework3.model.Person;

import java.util.Comparator;

public class SortPersonsByAge implements Comparator<Person> {
    public int compare(Person firstPerson, Person secondPerson) {
        return firstPerson.getAge() - secondPerson.getAge();
    }
}
