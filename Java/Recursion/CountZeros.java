package Recursion;

import java.util.Scanner;

public class CountZeros {
    public static int countZerosRec(int n){
        if(n<=9){
            if(n==0){
                return 1;
            }else{
                return 0;
            }
        }
        int lastDig = n%10;
        if(lastDig==0){
            return 1+countZerosRec(n/10);
        }else{
            return 0+countZerosRec(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countZerosRec(n));
        sc.close();
    }
}
