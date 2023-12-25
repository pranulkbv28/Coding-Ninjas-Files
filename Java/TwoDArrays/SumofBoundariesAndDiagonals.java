package TwoDArrays;

import java.util.Scanner;

public class SumofBoundariesAndDiagonals {
    public static void sumOfBoundAndDiag(int[][] arr){
        int sum=0;
        // sum of 1st and last row
        for(int i=0;i<arr.length;i=i+arr.length-1){
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
        //sum of 1st and last column
        for(int i=0;i<arr.length;i=i+arr.length-1){
            for(int j=1;j<arr.length-1;j++){
                sum+=arr[j][i];
            }
        }
        System.out.println(sum);
        //sum of 1st diagonal
        for(int i=1;i<arr.length-1;i++){
            for(int j=i;j<i+1;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
        //sum of 2nd diagonal
        for(int i=arr.length-2, j=1;i>=1 && j<arr.length-1;i--,j++){
                if(i==j){
                    continue;
                }
                sum+=arr[i][j];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sumOfBoundAndDiag(arr);
        sc.close();
    }
}
