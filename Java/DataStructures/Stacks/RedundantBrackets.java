package DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class RedundantBrackets {

    public static boolean isRedundantBrackets(String expression) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                int j = i + 1;
                while (expression.charAt(j) != ')') {
                    String temp = Character.toString(expression.charAt(j));
                    stack.push(temp);
                    j++;
                }
                i = j;
            } else if (expression.charAt(i) == ')') {
                if (stack.size() == 1) {
                    return true;
                } else {
                    stack.pop();
                    if (stack.pop() == ")") {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isRedundantBrackets(str));

        sc.close();
    }
}
