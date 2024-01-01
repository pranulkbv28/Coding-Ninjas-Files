package SearchingAndSorting;

import java.util.Scanner;

public class FindingKthSmallestNumber {
    public static void swap(int arr[],int l, int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public static int[] toBubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }
    public static int kthSmallest(int[] arr, int n, int k){
        int sortedArray[] = toBubbleSort(arr);
        System.out.print("\nThe sorted array is: ");
        for(int i=0;i<sortedArray.length;i++){
            System.out.print(sortedArray[i]+" ");
        }
        return sortedArray[k-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("\nEnter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnter the kth smallest element to me found: ");
        int k = sc.nextInt();
        System.out.print("\nThe "+k+"th smallest elemt is: "+kthSmallest(arr, n, k));
        sc.close();
    }
}
