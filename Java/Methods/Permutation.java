package Methods;

import java.util.Scanner;

class Permutation {
    public static int facto(int a){
        int factorial = 1;
        for(int i=1;i<=a;i++){
            factorial = factorial*i;
        }
        return factorial;
    }    
    public static int permutation(int N, int R){
        if(N<R){
            return -1;
        }

        int permutation = facto(N)/(facto(N-R));
        return permutation;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        System.out.println(permutation(N, R));
        sc.close();
    }
}
