public class Meat extends Food {
    private String typeOfMeat;

    public Meat(double caloriesPer100gr, double weight, double price, String typeOfMeat) {
        super(caloriesPer100gr, weight, price);
        this.typeOfMeat = typeOfMeat;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "typeOfMeat='" + typeOfMeat + '\'' +
                '}';
    }

    public double computeTotalCalories() {
        return getWeight() * getCaloriesPer100gr() * 4.54;
    }

    public void information() {
        System.out.println("This is a " + getWeight()
                + " pound box of " + typeOfMeat
                + ". The calories in this type of meat per 100 grams are "
                + getCaloriesPer100gr() + " so it has a total of " + computeTotalCalories()
                + " calories.");
    }

    public void printTotalCalories() {
        System.out.println("The type of meat: '" + typeOfMeat
                + "' has a total of " + computeTotalCalories()
                + " calories.");
    }

}
