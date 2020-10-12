package DataStructures.LinkedList;

public class SingleList {
    Node head;

    void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        }
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node =new Node();
        node.data = data;
        node.next = head;
        head = node;

    }

    public void insertAtPosition(int data,int position) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (position == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < position - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public  void delete(int index){
        if(index == 0){
            head = head.next;
        }
        else {
            Node n = head;
            for (int i=0;i<index-1;i++){
                n=n.next;
            }
            Node temp =n.next;
            n.next = temp.next;
        }
    }

    void show(){
        Node node = head;
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
