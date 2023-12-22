package Strings;

import java.util.Scanner;

class CountWords1 {
    public static void countWords(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        count++;
        System.out.println("The total number of words in the Sentence is: "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String str = sc.nextLine();
        countWords(str);
        sc.close();
    }    
}
