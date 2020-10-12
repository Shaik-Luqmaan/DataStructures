package DataStructures.LinkedList;

public class Driver {
    public static void main(String[] args) {
        SingleList list =new SingleList();
        list.insert(2);
        list.insert(4);
        list.insert(3);

        list.insertAtStart(7);

        list.insertAtPosition(11,0);

        list.delete(3);

        list.show();
    }
}
