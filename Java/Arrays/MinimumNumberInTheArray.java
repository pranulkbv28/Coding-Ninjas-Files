package Arrays;

import java.util.Scanner;

class MinimumNumberInTheArray {
    public static int minimum(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            int a = arr[i];
            if(a<min){
                min = a;
            }
        }
        return min;
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minimum(arr));
        sc.close();
    }  
}
