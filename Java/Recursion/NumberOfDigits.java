package Recursion;

import java.util.Scanner;

public class NumberOfDigits {
    public static int countDigits(int n) {
        if (n == 0) {
            return 0; // Base case: if n becomes 0, return 0 to end the recursion
        }
        return 1 + countDigits(n / 10); // Count the current digit and make a recursive call for the rest
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
        sc.close();
    }
    
}
