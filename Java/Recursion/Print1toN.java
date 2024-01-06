package Recursion;

import java.util.Scanner;

public class Print1toN {
    public static void printUpto(int n){
        if(n==0){
            return;
        }
        printUpto(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printUpto(n);
        sc.close();
    }
}
