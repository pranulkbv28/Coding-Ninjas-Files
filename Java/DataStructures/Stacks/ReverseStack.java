package DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    // public static void reverseStack(Stack<Integer> s1, Stack<Integer> helper){
        
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            stack.push(data);
        }
        Stack<Integer> helper = new Stack<>();
        helper.addAll(stack);
        while(!stack.isEmpty()){
            stack.pop();
        }
        stack.addAll(helper);
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        
        sc.close();
    }
}
