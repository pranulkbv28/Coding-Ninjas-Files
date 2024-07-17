// this is an algorithm that sorts an array in a single scan. It uses three pointers, start, mid and high. The approach is as follows.

import java.util.*;

public class DutchNationalFlagAlgorithm {

    public static boolean validateGivenArray(int arr[], int n){
        for(int i=0; i<n; i++){
            if(arr[i] < 0 || arr[i] > 2){
                return false;
            }
        }

        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] sort012(int arr[], int n){
        int low = 0, mid = 0, high = n-1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }

        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("\nEnter the array elements: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        if(validateGivenArray(arr, n)){
            int sortedArr[] = sort012(arr, n);
            System.out.print("\nThe sorted array is: ");
            for(int i=0; i<n; i++){
                System.out.print(sortedArr[i]+" ");
            }
        }else{
            System.out.print("\nInvalid Input");
        }

        sc.close();
    }
}
