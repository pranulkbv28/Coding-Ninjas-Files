// for this question, let us use Binary Search.

import java.util.*;

public class FindSquareRoot {

    public static int sqrt(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int start =1, end = n, ans = 0;

        while(start <= end){
            int mid = (start+end)/2;

            if(mid*mid == n){
                // perfectSqrt = true;
                return mid;
            }

            if(mid*mid < n){
                // perfectSqrt = false;
                ans = mid;
                start = mid+1;
            } else{
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number whose square root you want: ");
        int n = sc.nextInt();
        // boolean perfectSqrt = false;
        int sqareRoot = sqrt(n);

        if(sqareRoot*sqareRoot == n){
            System.out.print("\nThe square root of "+n+" is: "+sqareRoot);
        }else{
            System.out.print("\nThe closest square root of "+n+" is: "+sqareRoot);
        }

        sc.close();
    }
}
