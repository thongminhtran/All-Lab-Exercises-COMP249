import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stack stack = new Stack();
        //Pop a list of 10 integers
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter 10 elements to push into stack: ");
            for (int i = 0; i < 10; i++) {
                int n = scan.nextInt();
                stack.push(n);
            }
        } catch (OverfulStackException e) {
            e.printStackTrace();
        }

        //Trying to pop 11th element to see what happen
        try {
            stack.push(11);
        } catch (OverfulStackException e) {
            System.out.println(e);
        }

        //Pop all the elements in the stack using try/catch block

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Popped " + stack.pop());
            } catch (EmptyStackException e) {
                e.printStackTrace();
            }
        }
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println(e);
        }
    }

}
