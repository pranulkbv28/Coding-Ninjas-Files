package Patterns;

import java.util.Scanner;

public class Hourglass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int space=1;space<=i-1;space++){
                System.out.print(" ");
            }
            for(int num=i;num<=n;num++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int space=1;space<=i-1;space++){
                System.out.print(" ");
            }
            for(int num=i;num<=n;num++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
