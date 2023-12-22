package Strings;

import java.util.Scanner;

class TakeInputOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nextLine(), when printing this as the output, the entire String is shown
        System.out.print("Enter the String: ");
        String str1 = sc.nextLine();
        System.out.println("The entered String is: "+str1);

        // next(), the difference between next() and nextLine() is that in nex(), one input takes only until the 1st space.
        // use this as the Input: "Hello my name is Pranaav"
        System.out.print("Enter the String: ");
        String str2 = sc.next();
        System.out.println("The 1st input is: "+str2);
        String str3 = sc.next();
        System.out.println("The 2nd input is: "+str3);
        String str4 = sc.nextLine();
        System.out.println("The remaining of the String is: "+str4);

        sc.close();
    }    
}
