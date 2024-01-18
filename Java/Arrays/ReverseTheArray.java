package Arrays;

import java.util.Scanner;

class ReverseTheArray {
    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n"+str);
        int input = sc.nextInt();
        sc.close();
        return input;
    }    
    public static void reverse(int arr[], int size){
        for(int L=0, R=size-1;R>L;L++, R--){
            int c = arr[L];
            arr[L] = arr[R];
            arr[R] = c;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int cap = takeInput("Enter the capacity of the array: ");
        int A[] = new int[cap];
        for(int i=0;i<cap;i++){
            A[i] = takeInput("Enter the value at "+i+" index: ");
        }
        reverse(A, cap);
    }
    
}
