package Methods;

import java.util.Scanner;

class GCD {
    public static int greatestCommonDivisor(int n, int m){
        int divisor=1;
        for(int i=2;i<=m;i++){
            if(m%i==0 && n%i==0){
                 divisor = i;
            }
        }
        return divisor;
    }  
    public static int findingGCD(int a, int b){
        
        if(a>b){
            int gcd = greatestCommonDivisor(a, b);
            return gcd;
        }
        else if(b>a){
            int c =a;
            a = b;
            b = c;
            int gcd = greatestCommonDivisor(a, b);
            return gcd;
        }
        else{
            return 1;
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int GCD = findingGCD(a, b);
        System.out.println(GCD);
        sc.close();
    }    
}
