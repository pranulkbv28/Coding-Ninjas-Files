package Recursion;

import java.util.Scanner;

public class RemoveX {
    public static String removeX(String input, int index){
		if(index==input.length()){
			return input;
		}
		if(input.charAt(index)=='x'){
			input = input.substring(0, index)+input.substring(index+1);
            index--;
		}
		return removeX(input, index+1);
	}
	// Return the changed string
	public static String removeX(String input){
		// Write your code here
		return removeX(input, 0);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeX(str));
        sc.close();
        // System.out.println(removeX("pxxp"));
    }
}
