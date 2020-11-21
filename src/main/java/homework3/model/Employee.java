package homework3.model;

import homework3.model.Person;

public class Employee extends Person {
    private String employerName;
    private int salaryInEuro;

    public Employee(String firstName, String lastName, int age, String employerName, int salaryInEuro) {
        super(firstName, lastName, age);
        this.employerName = employerName;
        this.salaryInEuro = salaryInEuro;
    }
}
