package Strings;

import java.util.Scanner;

class ReverseEachWord2 {
    public static String reverseString(String str, int start, int end){
        String revStr = "";
        for(int i=end;i>=start;i--){
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }
    public static String reverseWords(String str){
        String finalString = "";
        int start = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '||i==str.length()-1){
                int end = (i==str.length()-1)?i:i-1;
                String reverseWord = reverseString(str, start, end);
                finalString += reverseWord+" ";
                start = i+1;
            }
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
