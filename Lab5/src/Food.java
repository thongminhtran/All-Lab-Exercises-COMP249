public abstract class Food {
    private double caloriesPer100gr;
    private double weight;
    private double price;

    public Food(double caloriesPer100gr, double weight, double price) {
        this.caloriesPer100gr = caloriesPer100gr;
        this.weight = weight;
        this.price = price;
    }

    public double getCaloriesPer100gr() {
        return caloriesPer100gr;
    }

    public void setCaloriesPer100gr(double caloriesPer100gr) {
        this.caloriesPer100gr = caloriesPer100gr;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Food{" +
                "caloriesPer100gr=" + caloriesPer100gr +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    public abstract double computeTotalCalories();

    public abstract void information();

    public abstract void printTotalCalories();
}
