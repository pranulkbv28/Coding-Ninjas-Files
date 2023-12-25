package Strings;

import java.util.Scanner;

class CompressTheString {
    public static String compressedString(String str){
        String ans = "";
        int currLength = 1;
        char currChar = str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==currChar){
                currLength++;
            }else{
                ans += currChar;
                if(currLength!=1){
                    ans += currLength;
                }
                currChar = str.charAt(i);
                currLength =1;
            }
        }
        ans += currChar;
        if(currLength!=1){
            ans += currLength;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compressedString(str));
        sc.close();
    }    
}
