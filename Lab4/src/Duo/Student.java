package Duo;

import Uno.Person;

public class Student extends Person {
    private double studyHours;
    private static int Calorie = getCalorie() + 500;

    public Student(int numberOfSiblings, int ID, double studyHours) {
        super(numberOfSiblings, ID);
        this.studyHours = studyHours;
    }


    public String toString() {
        return "Student{" +
                "ID=" + getID() +
                ", numberOfSiblings="+ getNumberOfSiblings()+
                ", calorieIntakePerDay="+ Calorie +
                ", studyHours=" + studyHours +
                '}';
    }
}
