package Patterns;

import java.util.Scanner;

class NumberOfSquares {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();

        // P1
        System.out.println("Pattern1");
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(); 


        // P2
        System.out.println("Pattern2");
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();        
        
        
        // P3
        System.out.println("Pattern3");
        for(int i = 1; i<=n; i++){
            for(int j=n; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }    
}
