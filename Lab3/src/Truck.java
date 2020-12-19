// Name: Thong Minh Tran
// Lab 3 - COMP 249 - Section J-X
public class Truck extends Vehicle{
    private int capacityOfTruck;

    public Truck(int numberOfWheels, int capacityOfTruck) {
        super(numberOfWheels);
        this.capacityOfTruck = capacityOfTruck;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacityOfTruck=" + capacityOfTruck +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }
}
