package Recursion;

import java.util.Scanner;

public class ToCheckIfArraySorted {
    public static boolean isArraySorted(int input[], int startIndex){
        if(startIndex==input.length-1){
            return true;
        }
        if(input[startIndex]>input[startIndex+1]){
            return false;
        }
        boolean isSorted = isArraySorted(input, startIndex+1);
        return isSorted;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isArraySorted(arr, 0));
        sc.close();
    }
}
