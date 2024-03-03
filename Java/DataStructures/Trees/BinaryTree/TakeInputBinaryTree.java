package DataStructures.Trees.BinaryTree;

import java.util.Scanner;

public class TakeInputBinaryTree {
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
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc, true, 0, true);
        printDetailedTree(root);
        sc.close();
    }
}
