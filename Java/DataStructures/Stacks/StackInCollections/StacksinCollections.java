package DataStructures.Stacks.StackInCollections;

import java.util.Stack;

public class StacksinCollections {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        // stack.push(10);

        // System.out.println(stack.size());
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.isEmpty());

        // int arr[] = { 5, 6, 7, 1, 9 };

        // for (int elem : arr) {
        // stack.push(elem);
        // }

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }

        // stack.push(5);
        // stack.push(10);
        // stack.push(15);
        // System.out.println(stack.pop()+stack.size());

        while (stack.isEmpty()) {
            stack.push(10);
        }
        System.out.print(stack.pop() + " " + stack.size());
    }

}
