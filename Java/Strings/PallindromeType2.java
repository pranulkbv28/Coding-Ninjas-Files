package Strings;

import java.util.Scanner;

class PallindromeType2 {
    public static boolean pallindromeChecker(String str){
        int l = 0;
        int r = str.length()-1;
        for(;r>l;r--,l++){
                if(str.charAt(l)!=str.charAt(r)){
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(pallindromeChecker(str));
        sc.close();
    }    
}
