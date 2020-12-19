
// Define class called Person with name attribute
public class Person {

    private String name;

    //Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Default constructor
    public Person(){
        this.name = null;
    }

    // Parameterized Constructor
    public Person(String name) {
        this.name = name;
    }


}
