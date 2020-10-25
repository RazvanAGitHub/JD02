package homework1.model;

public class Book { //abstraction
    private String name; //encapsulation
    private int noOfPages; //encapsulation

    public Book() {}

    public Book(String name, int noOfPages) {
        this.name = name;
        this.noOfPages = noOfPages;
    }

    //encapsulation
    public String getName() {
        return name;
    }
    //encapsulation
    public void setName(String newName) {
        name = newName;
    }
    //encapsulation
    public int getNoOfPages() {
        return noOfPages;
    }
    //encapsulation
    public void setNoOfPages(int newNoOfPages) {
        noOfPages = newNoOfPages;
    }

    public String toString() {
        return "name = " + getName() + ", noOfPages = " + getNoOfPages();
    }

}
