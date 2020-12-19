// Name: Thong Minh Tran
// Lab 3 - COMP 249 - Section J-X
public class Main {

    public static void main(String[] args) {
	// write your code here
        Car newCar = new Car(4, "gasoline");
        Truck newTruck = new Truck(4,10);
        Vehicle []twoVehicle=new Vehicle[]{newCar, newTruck};
        for(int i=0;i<twoVehicle.length;i++){
            System.out.println(twoVehicle[i].toString());
        }

    }
}
