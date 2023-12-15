package Methods;

import java.util.Scanner;

class SquareOfNumbers {
    public static int square(int n){
        int sq = n*n;
        return sq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq1 = square(n);
        System.out.println("The square of "+n+" is: "+sq1);

        sc.close();
    }    
}
