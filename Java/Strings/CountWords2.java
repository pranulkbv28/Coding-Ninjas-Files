package Strings;

import java.util.Scanner;

class CountWords2 {
    public static void countWords(String str) {
        String s[] = str.split(" ");
        System.out.println("The total number of words in the Sentence is: "+s.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String str = sc.nextLine();
        countWords(str);
        sc.close();
    }       
}
