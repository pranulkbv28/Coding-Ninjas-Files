package DataStructures.Stacks.IntroToStackUsingArray;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        StackUsingArray stack = new StackUsingArray();
        int arr[] = { 5, 6, 7, 1, 9 };
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // stack.push(2);
        // stack.top();
        // stack.pop();
        // stack.size();
        // stack.isEmpty();
    }
}
