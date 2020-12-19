public class Vegetable extends Food {
    private String nameOfVegetable;
    private Boolean cooked;

    public Vegetable(double caloriesPer100gr, double weight, double price, String nameOfVegetable, Boolean cooked) {
        super(caloriesPer100gr, weight, price);
        this.nameOfVegetable = nameOfVegetable;
        this.cooked = cooked;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "nameOfVegetable='" + nameOfVegetable + '\'' +
                ", cooked=" + cooked +
                '}';
    }

    public double computeTotalCalories() {
        return (cooked) ? 20 + getWeight() * getCaloriesPer100gr() * 4.54 : getWeight() * getCaloriesPer100gr() * 4.54;
    }

    public void information() {
        System.out.println("This is a " + getWeight() + " pound box of (cooked/raw) "
                + nameOfVegetable + " and the calories per 100 gram for this vegetable are "
                + getCaloriesPer100gr() + " so it has a total of " + computeTotalCalories()
                + " calories.");
    }

    public void printTotalCalories() {
        System.out.println("The name of vegetable: '" + nameOfVegetable
                + "' has a total of " + computeTotalCalories()
                + " calories.");
    }
}
