public class LinkedList<M> {
    Node head;

    public LinkedList() {

    }

    class Node {
        Monster monster;
        Node next;

        Node(Monster m, Node n) {
            monster = m;
            next = n;
        }
    }

    public LinkedList(Node head) {
        this.head = null;
    }

    //Create Insert method

    public void insert(Monster m) {
        head = insertSupporter(head, m);
        return;
    }

    // Create Remove method

    public void remove(Monster m) {
        head = removeSupporter(head, m);
        return;
    }

    @Override
    public String toString() {
        Node tempNode = head;
        String s = "";
        while (tempNode != null) {
            s += tempNode.monster.toString() + "--->";
            tempNode = tempNode.next;
        }
        return s + "null";
    }

    Node insertSupporter(Node h, Monster m) {
        if (h == null)
            return new Node(m, null);
        if (h.monster.compareTo(m) > 0) {
            Node newNode = new Node(m, null);
            newNode.next = h;
            return newNode;
        }
        h.next = insertSupporter(h.next, m);
        return h;
    }

    Node removeSupporter(Node h, Monster m) {
        if (h == null)
            return null;
        if (h.monster.equals(m))
            return h.next;
        h.next = removeSupporter(h.next, m);
        return h;
    }

}
