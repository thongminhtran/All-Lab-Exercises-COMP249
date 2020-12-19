package Duo;

import Uno.Person;

public class Employee extends Person {
    private static int employeeCalorie = 3000;
    public Employee(int numberOfSiblings, int ID) {
        super(numberOfSiblings, ID);
    }

    public String toString() {
        return "Employee{" +
                "ID=" + getID() +
                ", numberOfSiblings="+ getNumberOfSiblings()+
                ", calorieIntakePerDay="+ employeeCalorie +
                '}' + "\nI don't have to study, HA!";
    }
}
