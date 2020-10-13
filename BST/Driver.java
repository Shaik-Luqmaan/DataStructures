package DataStructures.BST;

public class Driver {
    public static void main(String[] args) {
        Node root = new Node(20);
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(root, 5);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 9);
        tree.insert(root, 7);

        tree.inorder(root);
        System.out.println("");

        boolean result = tree.search(78,root);
        System.out.println(result);
    }
}
