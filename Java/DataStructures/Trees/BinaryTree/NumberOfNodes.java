package DataStructures.Trees.BinaryTree;

import java.util.Scanner;

public class NumberOfNodes {

    public static BinaryTreeNode<Integer> takeInput(Scanner sc, boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter the root data: ");
        } else {
            if (isLeft) {
                System.out.println("Left Child of " + parentData + ": ");
            } else {
                System.out.println("Right Child of " + parentData + ": ");
            }
        }
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        BinaryTreeNode<Integer> leftChildNode = takeInput(sc, false, rootData, true);

        BinaryTreeNode<Integer> rightChildNode = takeInput(sc, false, rootData, false);
        root.left = leftChildNode;
        root.right = rightChildNode;
        return root;
    }

    public static int numNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftNodeCount = numNodes(root.left);
        int rightNodeCount = numNodes(root.right);
        return 1 + leftNodeCount + rightNodeCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc, true, 0, true);
        System.out.println("The number of nodes is: "+numNodes(root));

        sc.close();
    }
}
