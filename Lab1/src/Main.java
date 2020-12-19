public class Main {

    public static void main(String[] args) {
        // validate semester is wrong
        var myLab = new Lab();
        myLab.setSemester('a');
        System.out.println(myLab.getSemester());
        myLab.setSemester('w');
        System.out.println(myLab.getSemester());

        // validate default constructor
        var defaultLab = new Lab();
        System.out.println(defaultLab.toString());
        // validate copy constructor
        var copyLab = new Lab(defaultLab);
        System.out.println(copyLab.toString());

        // validate 3argument
        var argumentLab = new Lab("AAB", 50, 'f');
        System.out.println(argumentLab.toString());
        // validate equals
        var copyArgumentLab = new Lab(argumentLab);
        if (copyArgumentLab.equals(argumentLab)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
