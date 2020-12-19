import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int age;
    private double salary;

    public Employee(){
        // everything is empty
    }
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public boolean equals(Object obj){
        Employee e = (Employee) obj;
        if(e.name.compareTo(this.name)==0 && e.age==this.age && e.salary==this.salary)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
