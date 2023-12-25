package TwoDArrays;

import java.util.Scanner;

public class SetMatrixZeros {
    public static void setZeros(int matrix[][]) {
        int n = matrix.length;  // Number of rows in the matrix
        int m = matrix[0].length;  // Number of columns in the matrix
        boolean rowHasZero = false;  // Flag to determine if the first row contains a zero
        boolean colHasZero = false;  // Flag to determine if the first column contains a zero
    
        // Check if the first row has a zero
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                rowHasZero = true;  // Set flag to true if a zero is found in the first row
                break;  // Break out of the loop since a zero is found
            }
        }
    
        // Check if the first column has a zero
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                colHasZero = true;  // Set flag to true if a zero is found in the first column
                break;  // Break out of the loop since a zero is found
            }
        }
    
        // Mark rows and columns containing zeros (excluding the first row and first column)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;  // Mark the corresponding row in the first column
                    matrix[0][j] = 0;  // Mark the corresponding column in the first row
                }
            }
        }
    
        // Nullify rows based on the first column
        for (int i = 1; i < n; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < m; j++) {
                    matrix[i][j] = 0;  // Set the entire row to zero (excluding the first column)
                }
            }
        }
    
        // Nullify columns based on the first row
        for (int j = 1; j < m; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < n; i++) {
                    matrix[i][j] = 0;  // Set the entire column to zero (excluding the first row)
                }
            }
        }
    
        // Nullify the first row if it had a zero initially
        if (rowHasZero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;  // Set the entire first row to zero
            }
        }
    
        // Nullify the first column if it had a zero initially
        if (colHasZero) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;  // Set the entire first column to zero
            }
        }
    
        // Display the updated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");  // Print each element of the matrix
            }
            System.out.println();  // Move to the next line after printing a row
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        setZeros(matrix);
        sc.close();
    }
}
