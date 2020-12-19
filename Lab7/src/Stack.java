public class Stack {
    private final static int MAXCAPACITY = 10;
    int pile[];
    int position;

    public Stack() {
        pile = new int[MAXCAPACITY];
        position = -1;
    }

    public void push(int e) throws OverfulStackException {
        if (position == MAXCAPACITY - 1) {
            throw new OverfulStackException(e);
        }
        // Add e to the stack
        pile[++position] = e;
    }

    public int pop() throws EmptyStackException {
        // Check whether the stack is empty
        if (position == -1) {
            throw new EmptyStackException();
        }
        // if not empty, return the last element
        return pile[position--];
    }

    public int head() throws EmptyStackException {
        if (position == -1) {
            throw new EmptyStackException();
        }
        // if not empty, return head element
        return pile[position];
    }

    public void popAll() throws EmptyStackException {
        if (position == -1) {
            throw new EmptyStackException();
        } else {
            System.out.println("[");
            for (int i = position - 1; i >= 0; i--) {
                System.out.println(pile[i] + " ");
            }
            System.out.print("]\n");
            position = 0;
        }
    }

}
