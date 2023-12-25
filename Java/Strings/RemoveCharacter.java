package Strings;

import java.util.Scanner;

class RemoveCharacter {
    public static String removeCharacter(String str, char ch){
        String removedString = (str.replace(ch, ' '));
        return removedString.replaceAll("\\s+", "");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(removeCharacter(str, ch));
        sc.close();
    }    
}
