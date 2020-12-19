
// Define a class called Student extends Person
public class Student extends Person{
    // Have ID attribute
    private String ID;

    //Getter and Setter methods
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    //Default constructor
    public Student(){

    }

    public Student(String ID) {
        this.ID = ID;
    }

    public Student(String name, String ID) {
        super(name);
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= "+ super.getName() +
                ", ID='" + ID + '\'' +
                '}';
    }
}
