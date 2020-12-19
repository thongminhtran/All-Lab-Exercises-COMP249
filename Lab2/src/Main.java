import java.util.Scanner;

// Name: Thong Minh Tran
// ID: 40072745
// Lab 2 (Section J-X - 23 September, 2020)
public class Main {

    public static final String PSWD = "c249";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (checkPasswordOnlyThreeTimes())
            System.out.println("Correct");
    }

    public static boolean checkPasswordOnlyThreeTimes() {
        //todo later
        String passcode;
        Scanner sc = new Scanner(System.in);
        for (int tries = 0; tries < 3; ++tries) {
            System.out.println("Please enter your password.");
            passcode = sc.nextLine();
            if (passcode.equals(PSWD)) {
                System.out.println("Welcome!");
                return true;
            }
            System.out.println("Please try again.");
        }
        return false;
//If the password limit was reached without a correct password, send them an error message

    }
}


