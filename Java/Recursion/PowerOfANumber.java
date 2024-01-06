package Recursion;

import java.util.Scanner;

public class PowerOfANumber {
    public static int exponent(int n, int pow){
        if(pow==0){
            return 1;
        }
        int smallOutput = exponent(n, pow-1);
        return n*smallOutput;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(exponent(n, pow));
        sc.close();
    }
}
