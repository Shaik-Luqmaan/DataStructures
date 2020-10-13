package DataStructures.BinaryTree;

public class BinaryTree<T> {
    private TreeNode<T> rootNode;

    public TreeNode<T> getRootNode() {
        return rootNode;
    }
    public void setRootNode(TreeNode<T> rootNode) {
        this.rootNode = rootNode;
    }

    static void traversePreOrder(TreeNode node) {

        System.out.print(node.getData() + " ");

        if (node.getLeft() != null) {
            traversePreOrder(node.getLeft());
        }

        if (node.getRight() != null) {
            traversePreOrder(node.getRight());
        }
    }
     static void traverseInOrder(TreeNode node) {

        if (node.getLeft() != null) {
            traverseInOrder(node.getLeft());
        }

        System.out.print(node.getData() + " ");

        if (node.getRight() != null) {
            traverseInOrder(node.getRight());
        }
    }
     static void traversePostOrder(TreeNode node) {

        if (node.getLeft() != null) {
            traversePostOrder(node.getLeft());
        }

        if (node.getRight() != null) {
            traversePostOrder(node.getRight());
        }

        System.out.print(node.getData() + " ");
    }
}


