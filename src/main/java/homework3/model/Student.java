package homework3.model;

import homework3.model.Person;

public class Student extends Person {
   private String nameOfTheUniversity;

    public Student(String firstName, String lastName, int age, String nameOfTheUniversity) {
        super(firstName, lastName, age);
        this.nameOfTheUniversity = nameOfTheUniversity;
    }

    public String getNameOfTheUniversity() {
        return nameOfTheUniversity;
    }
}
