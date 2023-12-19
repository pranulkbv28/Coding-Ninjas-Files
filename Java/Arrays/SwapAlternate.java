package Arrays;

import java.util.Scanner;

class SwapAlternate {
    public static void swapping(int arr[]){
        int c = 0;
        for(int i=1;i<arr.length;i=i+2){
            c = arr[i-1];
            arr[i-1]=arr[i];
            arr[i]=c;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of Arrays: ");
        int n = sc.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++){
            System.out.print("Enter the size of the Array: ");
            int size = sc.nextInt();
            System.out.println("Enter the Array elements: ");
            int arr[] = new int[size];
            for(int j =0;j<arr.length;j++){
                arr[j] = sc.nextInt();
            }
            swapping(arr);
        }

        sc.close();
    } 
}
