package Patterns;

import java.util.Scanner;

public class TrianglePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();


        // P1
        System.out.println("Pattern 1");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // P2
        System.out.println("Pattern 2");
        int z = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(z++);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();        
        // P3
        System.out.println("Pattern 3");
        for(int i=1;i<=n;i++){
            int p = i;
            for(int j=1;j<=i;j++){
                System.out.print(p++);
            }
            System.out.println();
        }


        sc.close();
    }
}
