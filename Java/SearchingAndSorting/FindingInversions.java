package SearchingAndSorting;

import java.util.Scanner;

public class FindingInversions {
    public static int getInversions(int[] arr, int n){
        //Your code goes here
        int counter = 0;
        for(int i=0;i<n-1;i++){
            int minIdx = i;
            for(int j=i+1;j<n;j++){
                if(arr[minIdx]>arr[j]){
                    minIdx=j;
                }
            }
            counter += (minIdx-i);
            int temp=arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getInversions(arr, n));
        sc.close();
    }
}
