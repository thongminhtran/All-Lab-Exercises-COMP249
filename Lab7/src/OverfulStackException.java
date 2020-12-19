public class OverfulStackException extends Exception {
    OverfulStackException(int e) {
        super(e + " cannot be pushed to the stack");
    }
}
