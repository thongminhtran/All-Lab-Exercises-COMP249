public class Main {

    public static void main(String[] args) {
        // write your code here

        // Test Insertion part
        LinkedList linkedList = new LinkedList();
        System.out.println("Welcome to Insertion program:");
        linkedList.insert(new Monster("m", 2000));
        System.out.println(linkedList.toString());
        linkedList.insert(new Monster("m2", 1000));
        System.out.println(linkedList.toString());
        linkedList.insert(new Monster("m3", 500));
        System.out.println(linkedList.toString());
        linkedList.insert(new Monster("m4", 5000));
        System.out.println(linkedList.toString());

        // Test Deletion part

        System.out.println("Welcome to Deletion test:");
        linkedList.remove(new Monster("m3", 500));
        System.out.println("After deleting m3:");
        System.out.println(linkedList.toString());
        linkedList.remove(new Monster("m2", 1000));
        System.out.println("After deleting m2");
        System.out.println(linkedList.toString());

    }
}
