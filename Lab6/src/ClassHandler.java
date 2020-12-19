import java.io.*;


public class ClassHandler {
    private Student student;
    private String path;

    public ClassHandler(Student student, String path) {
        this.student = student;
        this.path = path;
    }

    public void writeToFile(String path) {
        try {
            FileWriter myWriter = new FileWriter(path);
            myWriter.write(student.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public Student readFromFile(String path) throws IOException {
        FileReader fr = new FileReader(path);
        int i;
        String text = "";
        while ((i = fr.read()) != -1)
            text = text + (char) i;
        return new Student(text);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
