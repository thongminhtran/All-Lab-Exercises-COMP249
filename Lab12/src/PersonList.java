
// Define a generic class accepts type parameter T which bounds to Person class
public class PersonList <T>{
    // Initialize LinkedList
    private Node head;
    private int size;

    // Start original list with size = 0
    public PersonList(){
        size = 0;
    }

    //Inner Node class
    protected class Node{
        private T object;
        private Node link;

        //Constructor


        public Node(T object) {
            this.object = object;
        }

        @Override
        public String toString() {
            return object.toString();
        }
    }

    // Define Insert method
    public void insert(T obj){
        Node tempNode = new Node(obj);

        if(head == null){
            head = tempNode;
        }else{

            Node temp = head;
            while(temp.link!=null){
                temp=temp.link;
            }
            temp.link = tempNode;

        }
        size++;
    }

    //Define Remove method
    public void remove(T obj){
        if(head == null){
            return;
        }
        Node thisNode  = head;
        Node lastNode = head;
        while (thisNode!=null){
            if(thisNode.object==obj){
                Node tempNode = thisNode;
                thisNode = lastNode;
                thisNode.link = tempNode.link;
            }
            lastNode = thisNode;
            thisNode = thisNode.link;
        }

    }

    public String toString(){
        String list = "Here are all members of the list: "+"\n";
        for(Node node = head;node!=null;node= node.link){
            list += node.toString()+"\n";
        }
        return list;
    }
}
