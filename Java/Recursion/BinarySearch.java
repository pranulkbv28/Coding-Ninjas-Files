package Recursion;

import java.util.Scanner;

public class BinarySearch {
    public static int toBinarySearch(int []arr, int startIndex, int endIndex, int x){
        if(startIndex>endIndex){
            return -1;
        }
        int midIndex = (startIndex+endIndex)/2;
        if(arr[midIndex]==x){
            return midIndex;
        }else if(arr[midIndex]<x){
            return toBinarySearch(arr, startIndex+1, endIndex, x);
        }else{
            return toBinarySearch(arr, startIndex, endIndex-1, x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(toBinarySearch(arr, 0, arr.length-1, x));
        sc.close();
    }
}
