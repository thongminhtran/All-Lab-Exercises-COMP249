// Name: Thong Minh Tran
// ID: 40072745
// Lab 1
public class Lab {
    String section;
    int capacity;
    char semester;

    public Lab() {
        this.capacity = 0;
    }

    // copy constructor
    public Lab(Lab a) {
        this.section = a.section;
        this.semester = a.semester;
        this.capacity = a.capacity;
    }

    public Lab(String section, int capacity, char semester) {
        this.capacity = capacity;
        this.semester = semester;
        this.section = section;
    }

    private static boolean validate(char input) {
        if (input == 'w' || input == 's' || input == 'f')
            return true;

        System.out.println("Semester value doesn't equal with w, s, or f");
        return false;
    }
    public boolean equals(Lab b) {
        return this.section.equals(b.section) && this.semester == b.semester;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public char getSemester() {
        return semester;
    }

    public void setSemester(char semester) {
        boolean valid = validate(semester);
        if (valid) this.semester = semester;
    }
    public String toString() {
        return "Lab{" +
                "section='" + section + '\'' +
                ", capacity=" + capacity +
                ", semester=" + semester +
                '}';
    }
}
