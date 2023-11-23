// In this question, we need to compute either a sum or product of all numbersfrom 1 to N
// The user inputs the number N and the choice C to either find sum or product
// If neither are choses, the output is -1





package Practice;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		// int a = 1;
		int sum=0;
        int mul = 1;

		if(C == 1){
			while(N>0){
				sum = sum+N;

				N--;
			}
            System.out.println(sum);
		}
        else if(C == 2){
			while(N>0){
				mul = mul*N;

				N--;
			}
            System.out.println(mul);
		}
        else{
            System.out.println(-1);
        }


        sc.close();
        
    }
}
