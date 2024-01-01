package SearchingAndSorting;

import java.util.Scanner;

public class SelectionSort {
    public static void toSelectSort(int []arr,int n){
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i;j<n-1;j++){
                if(arr[minIndex]>arr[j+1]){
                    minIndex=j+1;
                }
            }
            if(minIndex!=i){
                int temp=arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        toSelectSort(arr, n);
        sc.close();
    }
}
