package SearchingAndSorting;

import java.util.Scanner;

public class InsertionSort {
    public static void toInsertSort(int arr[], int n){
        for (int i = 1; i < n; i++) {
            int checker = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > checker) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = checker;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        toInsertSort(arr, n);
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
