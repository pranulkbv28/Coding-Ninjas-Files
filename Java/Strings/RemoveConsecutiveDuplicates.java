package Strings;

import java.util.Scanner;

class RemoveConsecutiveDuplicates {
    public static String removeDuplicates(String str){
            char[] ch = new char[str.length()];
            
            for (int i = 0; i < ch.length; i++) {
                ch[i] = str.charAt(i);
            }
            
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] == ch[i - 1]) {
                    ch[i - 1] = ' '; // Mark consecutive duplicate with a space
                }
            }
            
            int replaceAtIndex = 0;
            
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != ' ') {
                    ch[replaceAtIndex++] = ch[i];
                }
            }
            
            String replacedString = new String(ch, 0, replaceAtIndex);
            return replacedString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeDuplicates(str));
        sc.close();
    }    
}