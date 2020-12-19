public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create 4 students
        Student student1 = new Student("Tim","23411");
        Student student2 = new Student("Alex","23423");
        Student student3 = new Student("Anna","23421");
        Student student4 = new Student("Johnson","456775");
        // Add students to list
        PersonList <Student> studentPersonList = new PersonList<Student>();
        studentPersonList.insert(student1);
        studentPersonList.insert(student2);
        studentPersonList.insert(student3);
        studentPersonList.insert(student4);

        System.out.println(studentPersonList.toString());

        // Test Remove one student
        System.out.println("Remove student2:");
        studentPersonList.remove(student2);
        System.out.println("After removing student2:");
        System.out.println(studentPersonList.toString());

    }
}
