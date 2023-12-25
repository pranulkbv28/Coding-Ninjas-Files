package TwoDArrays;

import java.util.Scanner;

public class PrintLikeASineWave {
    public static void printWave(int mat[][]){
        for(int j=1;j<=mat[0].length;j++){
            if(j%2!=0){
                for(int i=0;i<mat.length;i++){
                    System.out.print(mat[i][j-1]+" ");
                }
            }else{
                for(int i=mat.length-1;i>=0;i--){
                    System.out.print(mat[i][j-1]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printWave(arr);
        sc.close();
    }
}
