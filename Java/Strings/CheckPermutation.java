package Strings;

import java.util.Scanner;

class CheckPermutation {
    public static boolean isPermutation(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
    
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
    
        for (int i = 0; i < charArray1.length; i++) {
            boolean found = false;
    
            for (int j = 0; j < charArray2.length; j++) {
                if (charArray1[i] == charArray2[j]) {
                    charArray2[j] = ' '; // Mark the character as visited
                    found = true;
                    break; // Break once a character is found and marked
                }
            }
    
            if (!found) {
                return false; // If a character in str1 isn't found in str2, return false
            }
        }
    
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isPermutation(str1, str2));
        sc.close();
    }    
}
