package Recursion;

import java.util.Scanner;

public class ReplaceCharacterOfString {
    public static String replaceCharacter(String str, char a, char b, int index) {
        if(index == str.length()){
            return str;
        }
        if(str.charAt(index) == a){
            str = str.substring(0, index) + b + str.substring(index + 1);
        }
        return replaceCharacter(str, a, b, index+1);
    }
    
    public static String replaceCharacter(String str, char a, char b) {
        return replaceCharacter(str, a, b, 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        System.out.println(replaceCharacter(str, a, b));
        sc.close();
    }
}
