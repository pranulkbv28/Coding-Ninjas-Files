package Patterns;

import java.util.Scanner;

class TrianglePattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =sc.nextInt();
		
        for(int i=1;i<=n;i++){
            int p =n;
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p=p-1;
            }
            System.out.println();
        }

        sc.close();
    }
}
