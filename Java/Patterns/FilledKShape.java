package Patterns;

import java.util.Scanner;

public class FilledKShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=i+1;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
