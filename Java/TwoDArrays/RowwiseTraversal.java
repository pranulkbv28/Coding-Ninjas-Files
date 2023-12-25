package TwoDArrays;

import java.util.Scanner;

class RowwiseTraversal {
    public static int[] printRowWise(int [][]a) {
        // Write your code here.
        int rows = a.length;
        int cols = a[0].length;
    
        int totalElements = rows * cols;
        int[] result = new int[totalElements];
    
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                result[index] = a[i][j];
                index++;
            }
        }
    
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[] result = printRowWise(a);

        // Printing the elements of the array
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
            sc.close();
        }    
}
