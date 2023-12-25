package Strings;

import java.util.Scanner;

class HighestOccuringCharacter {
    public static char highestOccuring(String str){
        // char occuringChar = ' ';
        // int max = 0;
        // for(int i=0;i<str.length();i++){
        //     int count=0;
        //     for(int j=0;j<str.length();j++){
        //         if(str.charAt(i)==str.charAt(j)){
        //             count++;
        //         }
        //     }
        //     if(count>max){
        //         max = count;
        //         occuringChar = str.charAt(i);
        //     }
        // }
        // return occuringChar;

        char occuringChar = ' ';
    	int max = 0;

    	for (int i = 0; i < str.length(); i++) {
        int count = 1; // Initialize count for each character

        // Check if the character has been encountered before
        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                count++;
            }
        }

        if (count > max) {
            max = count;
            occuringChar = str.charAt(i);
        }
    }

    return occuringChar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(highestOccuring(str));
        sc.close();
    }    
}
