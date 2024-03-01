package DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[') {
                stack.push(expression.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (expression.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (expression.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (expression.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Boolean ifBalanced = isBalanced(str);
        System.out.println(ifBalanced);
        sc.close();
    }

}
