package Practice;

import java.util.Scanner;

class FahrenheitToCelcius {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Start Fahrenheit Value: ");
        int S = sc.nextInt();
        System.out.print("Enter the End Fahrenheit Value: ");
        int E = sc.nextInt();
        System.out.print("Enter the Step-Size Fahrenheit Value: ");
        int W = sc.nextInt();
        for(int i=S; i<=E; i=i+W){
           double cel = (i-32)*(5.0/9);
           System.out.println(i+"°F"+"="+(int)cel+"°C"); 
        }

        sc.close();
            
            // System.out.println((int)cel);
            

    }
}
