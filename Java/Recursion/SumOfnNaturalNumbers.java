package Recursion;

import java.util.Scanner;

public class SumOfnNaturalNumbers {
    public static int sum(int n){
        if(n==0){
            return 0;
        }

        int smallOutput = sum(n-1);
        int output = n + smallOutput;
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}
