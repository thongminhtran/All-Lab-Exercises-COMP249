package Uno;

import Duo.Employee;
import Duo.Student;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student(2,40072745,5);
        Student student2 = new Student(1,2343212,4);
        Student student3 = new Student(3,23414123,1);
        Student []students = {student1,student2,student3};

        // Display list of students here
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].toString());
        }

        Employee employee1 = new Employee(1,232342);
        Employee employee2 = new Employee(2,232678);
        Employee employee3 = new Employee(3,234686);
        Employee []employees = {employee1,employee2,employee3};

        // Display list of employees here
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i].toString());
        }
    }
}
