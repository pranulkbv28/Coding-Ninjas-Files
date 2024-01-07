package Recursion;

import java.util.Scanner;

public class GeometricProgression {
    public static double findGeometricSum(int k){
        return findGeometricSumHelper(k, 1.0);
    }
    
    private static double findGeometricSumHelper(int k, double term){
        if(k == 0){
            return term;
        }
        return term + findGeometricSumHelper(k - 1, term / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findGeometricSum(n));
        sc.close();
    }
}
