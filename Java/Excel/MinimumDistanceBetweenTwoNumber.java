package Excel;

import java.util.Scanner;

public class MinimumDistanceBetweenTwoNumber {
    public static int minimumDistance(int arr[], int n, int x, int y) {
		// Write your code here.
		boolean isPresent=false;
		int minDist = Integer.MAX_VALUE;
		if(n==1){
			return -1;
		}else{
			for(int i=0;i<n;i++){
				if(arr[i]==x||arr[i]==y){
					isPresent = true;
					for(int j=i+1;j<n;j++){
						if(arr[j]==x||arr[j]==y){
							if(arr[i]!=arr[j]){
								minDist = Math.min(minDist,j-i);
								break;
							}
						}
					}
				}
			}
		}
		if(isPresent){
			return minDist;
		}else{
			return -1;
		}
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(minimumDistance(arr, n, x, y));
        sc.close();
    }

}
