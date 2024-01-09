package SearchingAndSorting;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] input, int startIndex, int endIndex) {
		if(startIndex>=endIndex){
			return;
		}
		int pivotIndex = partitionArray(input, startIndex, endIndex);
		quickSort(input, startIndex, pivotIndex-1);
		quickSort(input, pivotIndex+1, endIndex);
	}
	public static int partitionArray(int[] input, int startIndex, int endIndex) {
    int pivot = input[startIndex], count = 0;
    for(int i = startIndex + 1; i <= endIndex; i++){
        if(input[i] <= pivot){
            count++;
        }
    }
    int pivotIndex = startIndex + count;
    int temp = input[startIndex];
    input[startIndex] = input[pivotIndex];
    input[pivotIndex] = temp;
    int i = startIndex, j = endIndex;
    while(i < pivotIndex && j > pivotIndex){
        while(input[i] <= pivot){
            i++;
        }
        while(input[j] > pivot){
            j--;
        }
        if(i < pivotIndex && j > pivotIndex){
            int tempI = input[i];
            input[i] = input[j];
            input[j] = tempI;
            i++;
            j--;
        }
    }
    return pivotIndex;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
