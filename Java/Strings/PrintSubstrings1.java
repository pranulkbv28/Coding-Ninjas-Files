package Strings;

import java.util.Scanner;

class PrintSubstrings1 {
    public static void allSubstrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.print(str.substring(i, j+1)+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        String str = sc.nextLine();
        allSubstrings(str);
        sc.close();
    }    
}
