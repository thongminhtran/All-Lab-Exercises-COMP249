import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Student student1 = new Student("Tim", "40072745", 'A');
        String path = "40072745.txt";
        ClassHandler newFile = new ClassHandler(student1, path);
        newFile.writeToFile(path);
        System.out.println(newFile.readFromFile(path).toString());

    }

}
