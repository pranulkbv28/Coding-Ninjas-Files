package Patterns;

import java.util.Scanner;

public class InterestingAlphaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            char alpha = (char)(('A'+n-1)-i+1);
            for(int j=1;j<=i;j++){
                System.out.print(alpha);
                alpha = (char)(alpha+1);
            }
            System.out.println();
        }

        sc.close();
    }
}
