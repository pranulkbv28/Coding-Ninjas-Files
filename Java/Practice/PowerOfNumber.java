package Practice;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int mul = num*num;

        if(pow == 0){
            mul = 1;
            System.out.println(mul);
        }
        else{
            for(int i=2; i<pow; i++){
                mul = mul*num;
            }
            System.out.println(mul);
        }



        sc.close();
    }
}
