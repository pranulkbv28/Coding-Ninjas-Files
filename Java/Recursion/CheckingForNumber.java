package Recursion;

import java.util.Scanner;

public class CheckingForNumber {
    // public static boolean checkForNumber(int input[], int index, int x){
    //     if(index==0){
    //         if(x==input[index]){
    //             return true;
    //         }else{
    //             return false;
    //         }
    //     }
    //     boolean checker = checkForNumber(input, index-1, x);
    //     if(checker==true){
    //         return true;
    //     }
    //     if(x==input[index]){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }
    public static boolean checkForNumber(int input[], int index, int x){
    	if(index < 0){
        	return false;
    	}
    	return (x == input[index]) || checkForNumber(input, index-1, x);
	}
    public static boolean isNumber(int input[], int x){
        return checkForNumber(input, input.length-1, x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(isNumber(arr, x));
        sc.close();
    }    
}
