package Recursion;

import java.util.Scanner;

public class Pallindrome {
    public static boolean isPallindrome(String str){
        if(str.length()==0 || str.length()==1){
            return true;
        }
        if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }
        return isPallindrome(str.substring(1, str.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPallindrome(str));
        sc.close();
    }
}
