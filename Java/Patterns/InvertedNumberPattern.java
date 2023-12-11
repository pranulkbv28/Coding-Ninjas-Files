package Patterns;

import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>=1;j--){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
