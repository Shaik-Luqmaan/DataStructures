package DataStructures.DoubleLinkedList;

public class MyLinkedList {
    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node node = new Node(data);

        if(head == null) {
            head = tail = node;
            head.previous = null;
        }
        else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        tail.next = null;
    }
    public void insertAtStart(int data){
        Node node =new Node(data);
        node.next = head;
        head.previous = node;
        node.previous=null;
        head = node;

    }

    void deleteLast() {
        Node n = head;
        if (head == null) {
            return;
        } else {
            if (head != tail) {
                tail = tail.previous;
                tail.next = null;
            } else {
                head = tail = null;
            }
        }
    }

    void show(){
        Node n = head;
            if(head == null) {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Doubly linked list is: ");
            while(n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }

        }
}
