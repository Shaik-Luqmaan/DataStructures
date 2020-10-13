package DataStructures.BinaryTree;

class Test{
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        TreeNode<Integer> rootNode = new TreeNode<>(1);
        binaryTree.setRootNode(rootNode);
        binaryTree.getRootNode().setLeft(new TreeNode<>(2));
        binaryTree.getRootNode().setRight(new TreeNode<>(3));

        binaryTree.getRootNode().getLeft().setLeft(new TreeNode<>(4));
        binaryTree.getRootNode().getLeft().setRight(new TreeNode<>(5));

        binaryTree.getRootNode().getRight().setLeft(new TreeNode<>(6));
        binaryTree.getRootNode().getRight().setRight(new TreeNode<>(7));

        System.out.println("Pre order traversing:");
        BinaryTree.traversePreOrder(binaryTree.getRootNode());
        System.out.println();

        System.out.println("In order traversing:");
        BinaryTree.traverseInOrder(binaryTree.getRootNode());
        System.out.println();

        System.out.println("Post order traversing:");
        BinaryTree.traversePostOrder(binaryTree.getRootNode());
        System.out.println();
    }
}