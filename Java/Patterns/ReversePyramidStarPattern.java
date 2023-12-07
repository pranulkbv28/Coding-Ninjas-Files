package Patterns;

import java.util.Scanner;

public class ReversePyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int p =n;

            for(int i=1;i<=n;i++){
                for(int sp=1;sp<i;sp++){
                    System.out.print(" ");
                }
                for(int j=1;j<=p;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
                p--;
            }

            sc.close();
    }    
}
