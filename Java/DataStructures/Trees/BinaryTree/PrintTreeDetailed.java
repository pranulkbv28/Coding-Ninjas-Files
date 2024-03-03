package DataStructures.Trees.BinaryTree;

public class PrintTreeDetailed {

    public static void printDetailedTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ": ");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ", ");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printDetailedTree(root.left);
        printDetailedTree(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        root.left = rootLeft;
        root.right = rootRight;
        BinaryTreeNode<Integer> rootLeftChild = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> rootRightChild = new BinaryTreeNode<>(5);
        rootLeft.right = rootLeftChild;
        rootRight.left = rootRightChild;

        printDetailedTree(root);
    }
}
