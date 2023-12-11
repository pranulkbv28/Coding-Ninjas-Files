package Patterns;

import java.util.Scanner;

public class ReverseCharPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = (char)('A'+n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char p = (char)(ch-j+1);
                System.out.print(p);
            }
            System.out.println();
        }

        sc.close();
    }
}
