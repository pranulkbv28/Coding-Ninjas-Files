package Recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void printFrom(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printFrom(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printFrom(n);
        sc.close();
    }
}
