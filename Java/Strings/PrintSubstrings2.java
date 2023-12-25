package Strings;

import java.util.Scanner;

class PrintSubstrings2 {
    public static void allSubstrings(String str){
        // for(int i=0;i<str.length();i++){
        //     System.out.print(str.substring(i, i+1)+" ");
        // }
        // for(int i=0;i<str.length()-1;i++){
        //     System.out.print(str.substring(i, i+2)+" ");
        // }
        // for(int i=0;i<str.length()-2;i++){
        //     System.out.print(str.substring(i, i+3)+" ");
        // }
        // for(int i=0;i<str.length()-3;i++){
        //     System.out.print(str.substring(i, i+4));
        // }


        int len = str.length();

        for (int subLen = 1; subLen <= len; subLen++) {
            for (int i = 0; i <= len - subLen; i++) {
                System.out.print(str.substring(i, i + subLen) + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        allSubstrings(str);
        sc.close();
    }    
}
