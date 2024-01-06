package Recursion;

import java.util.Scanner;

public class SumOfArrayUsingRecursion {
    // public static int sumOfArrayElements(int arr[], int n){
        
    //     if(n==1){
    //         return arr[0];
    //     }
    //     int smallOutput = sumOfArrayElements(arr, n-1);
    //     int output = arr[n-1]+smallOutput;
        
    //     return output;
    // }
    public static int sumOfArrayElements(int arr[], int n, int index){
		if(index==n){
			return 0;
		}
		return arr[index]+=sumOfArrayElements(arr, n, index+1);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumOfArrayElements(arr, n, 0));
        sc.close();
    }
}
