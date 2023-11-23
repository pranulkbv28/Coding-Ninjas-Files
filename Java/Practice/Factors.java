package Practice;

import java.util.Scanner;

public class Factors {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isFactor = true;
        int factorCount = 0;

            for(int i=2; i<=num; i++){
                if(num%i==0){
                    isFactor = true;
                    factorCount++;
                }
                else{
                    isFactor = false;
                }
                
                if((isFactor) && (i!=num)){
                    System.out.print(i+" ");
                }
            }
            if(factorCount==1){
                System.out.println(-1);
            }
            

        sc.close();
    }
}
