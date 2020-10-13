package DataStructures.BST;

public class BinarySearchTree {
    public Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        else if (data > root.getData())
            root.setRightChild(insert(root.getRightChild(), data));
        else
            root.setLeftChild(insert(root.getLeftChild(), data));
        return root;
    }

    public boolean search(int data,Node root) {
        Node current = root;
        while (current!=null){
            if(data<current.getData()){
                current = current.getLeftChild();
            }
            else if(data > current.getData()){
                current = current.getRightChild();
            }
            else
                return true;
        }
        return false;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.getLeftChild());
            System.out.print(" " + root.getData() + " ");
            inorder(root.getRightChild());
        }
    }
}

