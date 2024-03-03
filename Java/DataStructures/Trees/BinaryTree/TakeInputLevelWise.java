package DataStructures.Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {

    public static BinaryTreeNode<Integer> takeInputLevelWise(Scanner sc) {
        System.out.println("Enter the root data: ");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();
        pendingChildren.add(root);

        while (!pendingChildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of " + front.data);
            int left = sc.nextInt();
            if (left != -1) {
                BinaryTreeNode<Integer> leftChildNode = new BinaryTreeNode<Integer>(left);
                front.left = leftChildNode;
                pendingChildren.add(leftChildNode);
            }

            System.out.println("Enter right child of " + front.data);
            int right = sc.nextInt();
            if (right != -1) {
                BinaryTreeNode<Integer> rightChildNode = new BinaryTreeNode<Integer>(right);
                front.right = rightChildNode;
                pendingChildren.add(rightChildNode);
            }
        }
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
        BinaryTreeNode<Integer> root = takeInputLevelWise(sc);
        printDetailedTree(root);
        sc.close();
    }
}
