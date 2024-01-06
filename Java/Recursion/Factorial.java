package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int getFactorial(int n){
        if(n==0){
            return 1;
        }
        int smallOutput = getFactorial(n-1);
        int output = n*smallOutput;
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFactorial(n));
        sc.close();
    }
}
