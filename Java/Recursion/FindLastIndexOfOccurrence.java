package Recursion;


import java.util.Scanner;
public class FindLastIndexOfOccurrence {
    public static int checkForNumber(int input[], int index, int x){
    	if(index < 0){
        	return -1;
    	}
		if(x==input[index]){
			return index;
		}
		return checkForNumber(input, index-1, x);
	}
    public static int firstIndex(int input[], int x) {
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
        System.out.println(firstIndex(arr, x));
        sc.close();
    }
}
