// Name: Thong Minh Tran
// Lab 3 - COMP 249 - Section J-X
public class Car extends Vehicle{
    private String engineType;

    public Car(int numberOfWheels, String engineType) {
        super(numberOfWheels);
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType='" + engineType + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }
}
