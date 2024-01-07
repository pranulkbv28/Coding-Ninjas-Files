package Recursion;

import java.util.Scanner;

public class ReplacingPiWithNumValue {
    public static String replacePI(String str, int index){
        if(index==str.length()){
            return str;
        }        
        if(str.charAt(index)=='p'&&str.charAt(index+1)=='i'){
            str = str.substring(0, index)+"3.14"+str.substring(index+2);
            index--;
        }
        return replacePI(str, index+1);
    }
    public static String replacePI(String str){
        return replacePI(str, 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(replacePI(str));
        sc.close();
    }
}
