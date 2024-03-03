package DataStructures.Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LargestNode {

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

    public static int largestNode(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }

        int largestLeft = largestNode(root.left);
        int largestRight = largestNode(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInputLevelWise(sc);
        System.out.println(largestNode(root));
        sc.close();
    }
}
