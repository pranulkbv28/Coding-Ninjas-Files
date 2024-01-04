package SearchingAndSorting;

import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void mergingSortedArrays(int a[], int b[]){
        int c[] = new int[a.length+b.length];
        int i=0,j=0,k=0;
        // for(;i<a.length && j<b.length;){
        //     if(a[i]<b[j]){
        //         c[k] = a[i];
        //         i++;
        //         k++;
        //     }else if(a[i]>b[j]){
        //         c[k] =b[j];
        //         j++;
        //         k++;
        //     }
        // }
        // for(;i<a.length;i++){
        //     c[k] = a[i];
        //     k++;
        // }
        // for(;j<b.length;j++){
        //     c[k] = b[j];
        //     k++;
        // }
        for (; i < a.length && j < b.length; k++) {
            if (a[i] < b[j]) {
                c[k] = a[i++];
            } else {
                c[k] = b[j++];
            }
        }
        
        for (; i < a.length; i++, k++) {
            c[k] = a[i];
        }
        
        for (; j < b.length; j++, k++) {
            c[k] = b[j];
        }
        for(int p:c){
            System.out.print(p+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        mergingSortedArrays(a, b);
        sc.close();
    }
}
