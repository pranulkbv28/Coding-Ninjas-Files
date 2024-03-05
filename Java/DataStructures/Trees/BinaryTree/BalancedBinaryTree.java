package DataStructures.Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BalancedBinaryTree {

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

    public static int treeHeight(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftNodeHeight = treeHeight(root.left);
        int rightNodeHeight = treeHeight(root.right);

        return 1 + Math.max(leftNodeHeight, rightNodeHeight);
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftNodeHeight = treeHeight(root.left);
        int rightNodeHeight = treeHeight(root.right);

        if (Math.abs(leftNodeHeight - rightNodeHeight) > 1) {
            return false;
        }

        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInputLevelWise(sc);
        System.out.println(isBalanced(root));
        sc.close();
    }
}
