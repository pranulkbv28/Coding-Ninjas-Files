package Patterns;

import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = (n+1)/2;
        int n2 = n1-1;
        for(int i=1;i<=n1;i++){
            for(int space=1;space<=(n1-i);space++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n2;i>0;i--){
            for(int space=1;space<=n2-i+1;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
