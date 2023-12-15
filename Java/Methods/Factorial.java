package Methods;

import java.util.Scanner;

class Factorial {
    public static void fact(int n) {
        int factorial = 1;
		for(int i=1;i<=n;i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
	}    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
        sc.close();
    }
}
