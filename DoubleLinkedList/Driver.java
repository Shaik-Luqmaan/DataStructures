package DataStructures.DoubleLinkedList;

public class Driver {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(1);
        list.insert(4);
        list.insert(5);
        list.insert(9);

        list.insertAtStart(12);
        list.insertAtStart(13);

        list.deleteLast();

        list.show();
    }
}
