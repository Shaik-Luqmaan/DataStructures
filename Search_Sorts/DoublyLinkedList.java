package DataStructures.Search_Sorts;

class LinkedList {
}
class ListNode<E>{
    ListNode<E> prev; //Recursive datatype
    ListNode<E> next; //Reference of a class in the same class
    E data;

    public ListNode(E data){
        this.data = data;
    }
}
class MyLinkedList<E>{
    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;

    public MyLinkedList(){
        size = 0;
        head = new ListNode<>(null);
        tail = new ListNode<>(null);

        head.next = tail;
        tail.prev = head;
    }

    void add(E element) {
        if(element ==  null){


        }
    }
}