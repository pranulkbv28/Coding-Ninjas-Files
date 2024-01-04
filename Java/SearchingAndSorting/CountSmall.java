package SearchingAndSorting;

import java.util.Scanner;

public class CountSmall {
    public static int[] countS(int a[], int n, int b[], int m){
        int c[] = new int[n];
        int i=0,k=0;
        while(i<n){
            int count=0;
            int j=0;
            while(j<m){
                if(a[i]>b[j]){
                    count++;
                }
                j++;
            }
            c[k++]=count;
            i++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int m=sc.nextInt();
        int b[] = new int[m];
        for(int j=0;j<m;j++){
            b[j] = sc.nextInt();
        }
        int ans[] = countS(a, n, b, m);
        for(int i:ans){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
