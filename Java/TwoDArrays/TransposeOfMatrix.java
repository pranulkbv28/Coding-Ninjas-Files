package TwoDArrays;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static int[][] transpose(int arr[][], int n, int m){
        int a[][] = new int[m][n];
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                a[i][j]=arr[j][i];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int a[][] = transpose(arr, n, m);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
