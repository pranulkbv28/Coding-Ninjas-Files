package Practice;

import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int bin = sc.nextInt();
        int binToDec = bin;
        int pow = 0;
        int decNum = 0;
        while(binToDec>0){
            int term = binToDec%10;
            double decNumPlaceVal = (int) term*(Math.pow(2, pow));
            pow++;
            decNum = (int) decNumPlaceVal + decNum;
            binToDec = binToDec/10;
        }
        System.out.println("The decimal equivalent of "+bin+" is "+decNum);



        sc.close();
        // double decNum = (int) 3*(Math.pow(2, 2));
        // System.out.println( (int)decNum);
    }    
}
