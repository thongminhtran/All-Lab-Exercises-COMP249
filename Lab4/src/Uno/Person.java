package Uno;

public class Person {
    private int numberOfSiblings;
    private int ID;
    private static int Calorie = 2000;

    public Person(int numberOfSiblings, int ID) {
        this.numberOfSiblings = numberOfSiblings;
        this.ID = ID;
    }


    public String toString() {
        return "Person{" +
                "numberOfSiblings=" + numberOfSiblings +
                ", ID=" + ID +
                ", Calorie intake per day=" + Calorie +
                '}';
    }

    public int getNumberOfSiblings() {
        return numberOfSiblings;
    }

    public void setNumberOfSiblings(int numberOfSiblings) {
        this.numberOfSiblings = numberOfSiblings;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCalorie() {
        return Calorie;
    }

    public static void setCalorie(int calorie) {
        Calorie = calorie;
    }
}
