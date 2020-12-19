//Name: Thong Minh Tran
//ID: 40072745
//Lab 5 - COMP 249
public class Main {

    public static void main(String[] args) {
        // write your code here
        Meat meat1 = new Meat(300, 8, 25, "beef");
        Meat meat2 = new Meat(320, 5, 21, "chicken");
        Vegetable veg1 = new Vegetable(50, 7, 9, "broccoli", true);
        Vegetable veg2 = new Vegetable(21, 3, 2, "Salad", false);
        Food[] foods = new Food[]{meat1, meat2, veg1, veg2};
        Vegetable[] vegetables = new Vegetable[]{veg1, veg2};
        Meat[] meats = new Meat[]{meat1, meat2};
        for (int i = 0; i < foods.length; i++) {
            foods[i].information();
        }
        double totalCaloriesOfVegetable = 0.0;
        double totalCaloriesOfMeat = 0.0;
        for (int i = 0; i < vegetables.length; i++) {
            totalCaloriesOfVegetable += vegetables[i].computeTotalCalories();
        }
        System.out.println("Total calories of all the vegetables is " + totalCaloriesOfVegetable);

        for (int i = 0; i < meats.length; i++) {
            totalCaloriesOfMeat += meats[i].computeTotalCalories();
        }
        System.out.println("Total calories of all the Meats is " + totalCaloriesOfMeat);
    }
}
