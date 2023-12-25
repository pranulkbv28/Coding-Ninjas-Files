package Strings;

import java.util.Scanner;

class PallindromeType1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            // System.out.println(str.length());
            // System.out.println(str.charAt(3));
            char str2[] = new char[str.length()];
            for(int i=0;i<str2.length;i++){
                str2[i] = str.charAt(i);
            }
            int r = str2.length-1;
            int l = 0;
            for(;r>l;r--,l++){
                char temp = str2[l];
                str2[l] = str2[r];
                str2[r] = temp;
            }
            String reversedStr = new String(str2);
            // System.out.println(str.equals(reversedStr));
            System.out.println(str2);
            if(str.equals(reversedStr)){
                System.out.println("Is a pallindrome");
            }else{
                System.out.println("Is not a pallindrome");
            }
        sc.close();
    }    
}
