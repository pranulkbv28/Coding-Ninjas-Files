package Patterns;

import java.util.Scanner;

public class HollowNumberSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j==1){
                        System.out.print(1);
                    }
                    else if(j==n){
                        System.out.print(2);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
        }

        sc.close();
    }
}
