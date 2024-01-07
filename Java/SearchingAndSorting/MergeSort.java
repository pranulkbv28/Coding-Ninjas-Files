package SearchingAndSorting;

import java.util.Scanner;

public class MergeSort {
    public static void toMerge(int arr[], int l, int mid, int r){
        int len1 = mid-l+1, len2 = r-mid;
        int leftArr[] = new int[len1], rightArr[] = new int[len2];
        for(int i=0;i<len1;i++){
            leftArr[i]=arr[l+i];
        }
        for(int j=0;j<len2;j++){
            rightArr[j]=arr[mid+1+j];
        }
        int ptrA=0, ptrB=0, ptrC=l;
        while(ptrA<len1 && ptrB<len2){
            if(leftArr[ptrA]<rightArr[ptrB]){
                arr[ptrC++] = leftArr[ptrA];
                ptrA++;
            }else{
                arr[ptrC++] = rightArr[ptrB];
                ptrB++;
            }
        }
        while (ptrA<len1) {
            arr[ptrC++]=leftArr[ptrA++];
        }
        while (ptrB<len2) {
            arr[ptrC++]=rightArr[ptrB++];
        }
    }
    public static void toMergeSort(int arr[], int l, int r){
        if(l==r){
            return; 
        }
        int mid = (l+r)/2;
        toMergeSort(arr, l, mid);
        toMergeSort(arr, mid+1, r);
        toMerge(arr, l, mid, r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        toMergeSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
