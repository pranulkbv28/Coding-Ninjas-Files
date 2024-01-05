package SearchingAndSorting;

import java.util.Scanner;

public class ArrayEquilibriumIndex {
    public static int sumRight(int arr[]){
        int sum = 0;
        for(int i = 1; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    
    public static int arrayEquilibriumIndex(int[] arr){
        if(arr.length == 1){
            return -1;
        } else {
            int sumL = 0;
            int sumR = sumRight(arr);
            if(sumL == sumR){
                return 0; // If the array has only one element and it's an equilibrium
            } else {
                for(int i = 1; i < arr.length - 1; i++){
                    sumL += arr[i - 1];
                    sumR -= arr[i];
                    if(sumL == sumR){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arrayEquilibriumIndex(arr));
        sc.close();
    }   
}
