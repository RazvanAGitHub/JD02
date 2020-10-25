package homework1.model;

public class Novel extends Book{ //inheritance
    private String type; //encapsulation

    public Novel() {}

    public Novel(String name, int noOfPages, String type) {
        super(name, noOfPages);
        this.type = type;
    }

    //encapsulation
    public String getType() {
        return type;
    }
    //encapsulation
    public void setType(String newType) {
        type = newType;
    }

    public String toString() {
        return "name = " + getName() + ", noOfPages = " + getNoOfPages() + ", type = " + getType();
    }
}
