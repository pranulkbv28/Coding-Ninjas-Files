package Strings;

import java.util.Scanner;

class ReverseString {
    public static void reverseString(String str){
        String revStr1 = "";
        String revStr2 = "";
        // Method 1:
        for(int i=str.length()-1;i>=0;i--){
            revStr1 = revStr1 + str.charAt(i);
        }
        // Method 2:
        for(int i=0;i<str.length();i++){
            revStr2 = str.charAt(i)+revStr2;
        }
        System.out.println(revStr1);
        System.out.println(revStr2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverseString(str);
        sc.close();
    }    
}
