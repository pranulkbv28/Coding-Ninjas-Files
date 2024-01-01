package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearch {
    public static int toSearch(int arr[], int key){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                l = mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the array in ascending order: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnter the key to find: ");
        int key = sc.nextInt();
        System.out.println(toSearch(arr, key));
        sc.close();
    }
}
