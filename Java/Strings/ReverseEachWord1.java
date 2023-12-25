package Strings;

import java.util.Scanner;

class ReverseEachWord1 {
    public static String reverseString(String str){
        String revStr = "";
        for(int i=str.length()-1;i>=0;i--){
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }
    public static String reverseWords(String str){
        String finalString="";
        String arr[] = str.split(" ");
        for(int i=0;i<arr.length;i++){
            String currentWord = arr[i];
            String reverseWord = reverseString(currentWord);
            finalString += reverseWord+" ";
        }
        return finalString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWords(str));
        sc.close();
    }    
}
