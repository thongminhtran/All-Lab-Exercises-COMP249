// Name: Thong Minh Tran
// ID: 40072745
// LAB 10

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Instantiate a new AbstractFactoryPattern object

        AbstractFactoryPattern factoryPattern = new AbstractFactoryPattern();

        //Instantiate a new DelMonte object of type JuiceFactory

        JuiceFactory factory = new DelMonte();

        //Making the call to the makeJuices method

        factoryPattern.makeJuices(factory);
    }
}
