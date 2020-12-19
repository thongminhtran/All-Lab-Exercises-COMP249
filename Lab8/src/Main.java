import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Employee e1 = new Employee("Tim", 34, 1211);
        Employee e2 = new Employee("Tony", 22, 2144);
        Employee e3 = new Employee("Mary", 44, 2346);
        Employee e4 = new Employee("Thanh", 22, 7434);
        Employee e5 = new Employee("Thien", 26, 2422);
        Employee e6 = new Employee("Anna", 22, 7386);
        Employee e7 = new Employee("Vincent", 24, 2443);
        Employee e8 = new Employee("Bin", 21, 2144);
        Employee e9 = new Employee("Thong", 50, 2000);
        Employee e10 = new Employee("Superman", 21, 2000);
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        employeeArrayList.add(e4);
        employeeArrayList.add(e5);
        employeeArrayList.add(e6);
        employeeArrayList.add(e7);
        employeeArrayList.add(e8);
        employeeArrayList.add(e9);
        employeeArrayList.add(e10);
        // Write Object to binary file (.DAT)
        try {
            FileOutputStream fout = new FileOutputStream("employeesList.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(employeeArrayList);
            out.close();
            System.out.println("Objects are written into the binary file successfully.");
        } catch (Exception e) {
            System.out.print(e);
        }

        // Change the salary of 2-3 employees.
        employeeArrayList.get(2).setSalary(4020);
        employeeArrayList.get(5).setSalary(3100);
        employeeArrayList.get(8).setSalary(1000);

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employeesList.dat"));
            ArrayList<Employee> tempArray = new ArrayList<>();
            // Create tempArray, let it take all data from binary file.
            tempArray = (ArrayList<Employee>) in.readObject();
            boolean flag = false;
            for (int i = 0; i < tempArray.size(); i++) {
                // Display all old results in binary file. Using this data to compare with new results
                System.out.println(tempArray.get(i).toString());
                if (!tempArray.get(i).equals(employeeArrayList.get(i))) {
                    flag = true;
                }
            }
            in.close();
            if (flag == true) {
                FileOutputStream fout = new FileOutputStream("employeesList.dat");
                ObjectOutputStream out = new ObjectOutputStream(fout);
                out.writeObject(employeeArrayList);
                out.close();
                System.out.println("File Updated successfully.");
            }
        } catch (Exception e) {
            System.out.print(e);
        }

        // Display all New Results in the written binary file to compare with previous one.
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employeesList.dat"));
            ArrayList<Employee> tempArray = new ArrayList<>();
            tempArray = (ArrayList<Employee>) in.readObject();
            for (int i = 0; i < tempArray.size(); i++) {
                System.out.println(tempArray.get(i).toString());

            }
            in.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
