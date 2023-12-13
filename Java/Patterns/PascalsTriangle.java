package Patterns;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            int initNum = 1;
            for(int j=1;j<=i;j++){
                System.out.print(initNum+" ");
                initNum = initNum*((i-j))/j;
            }
            System.out.println();
        }

        sc.close();
    }
}
