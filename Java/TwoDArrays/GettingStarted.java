package TwoDArrays;

class GettingStarted {
    public static void main(String[] args) {
        // Initialisation and declaration
        int A[][] = new int[3][4]; //the array crerated here has 3 rows and 4 columns
        for(int i=0;i<3;i++){
            for(int j=0;i<4;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
