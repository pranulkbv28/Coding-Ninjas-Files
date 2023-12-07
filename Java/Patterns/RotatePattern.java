package Patterns;

import java.util.Scanner;

class RotatePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int p=i;
            for(int j=1;j<=n;j++){
                if(p>n){
                    p=1;
                }
                System.out.print(p);
                p++;
            }
            System.out.println();
        }


        sc.close();
    }    
}
