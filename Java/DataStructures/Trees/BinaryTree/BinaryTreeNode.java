package DataStructures.Trees.BinaryTree;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

// public class IntroToBinaryTree {

//     public static void printTre(BinaryTreeNode<Integer> root) {
//         if (root == null) {
//             return;
//         }
//         System.out.println(root.data);
//         // if(root.left!=null){
//         printTre(root.left);
//         // }
//         // if(root.right!=null){
//         printTre(root.right);
//         // }
//     }

    // public static void main(String[] args) {
    //     BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
    //     BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
    //     BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
    //     root.left = rootLeft;
    //     root.right = rootRight;
    //     BinaryTreeNode<Integer> rootLeftChild = new BinaryTreeNode<>(4);
    //     BinaryTreeNode<Integer> rootRightChild = new BinaryTreeNode<>(5);
    //     rootLeft.right = rootLeftChild;
    //     rootRight.left = rootRightChild;
    //     printTre(root);
    // }
// }
