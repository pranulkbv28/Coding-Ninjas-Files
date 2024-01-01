package SearchingAndSorting;

import java.util.Scanner;

public class FindingTheClosestIndex {
    public static int binarySearchClosest(int []nums, int target) {
        int left=0;
        int right=nums.length-1;
        int diff =Integer.MAX_VALUE;
        int closest = 0;
        while(left<=right){
            if(diff>target-nums[left]){
                diff = target-nums[left];
                closest = left;
            }
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right=mid-1;
            }
        }
        return closest;
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
        System.out.println(binarySearchClosest(arr, key));
        sc.close();
    }
}
