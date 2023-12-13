package Test1;

import java.util.Scanner;

public class SumOfEvenAndOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        int number = n;
         do{
            int digit = number%10;
            if(digit%2==0){
                evenSum = evenSum + digit;
            }
            else{
                oddSum = oddSum + digit;
            }
            number = number/10;
            
         }while(number>0);
         System.out.println(evenSum+" "+oddSum);
        sc.close();
    }
}
