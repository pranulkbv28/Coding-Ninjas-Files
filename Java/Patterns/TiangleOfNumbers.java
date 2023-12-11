package Patterns;

import java.util.Scanner;

public class TiangleOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int pos = 0;
            int num = 0;
            for(int space=1;space<=(n-i);space++){
                System.out.print(" ");
                pos = pos+1;
            }
            for(int j=i;j<=(2*(i-1)+1);j++){
                System.out.print(j);
                pos = pos+1;
                num = j;
            }
                for(int rev=num-1;rev>=i;rev--){
                System.out.print(rev);
            }
            System.out.println();
        }
        sc.close();
    }
}
