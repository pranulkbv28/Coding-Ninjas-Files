package SearchingAndSorting;

import java.util.Scanner;

public class PairWithSamllestDiff {
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
    public static int smallestFiffPair(int a[], int n, int b[], int m){
        toInsertSort(a, n);
        toInsertSort(b, m);
        int idx1=0,idx2=0;
        int minDiff = Math.abs(a[0]-b[0]);
        while(idx1<n && idx2<m){
            minDiff = Math.min(minDiff, Math.abs(a[idx1]-b[idx2]));
            if(a[idx1]<b[idx2]){
                idx1++;
            }else{
                idx2++;
            }
        }
        return minDiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[] = new int[n];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(smallestFiffPair(a, n, b, m));
        sc.close();
    }
}
