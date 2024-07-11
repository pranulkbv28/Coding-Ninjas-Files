import java.util.*;

public class ClosestIndexNew {

    public static int binarySearchClosest(int []nums, int left, int right, int target) {
         int mid = 0;
         while(left<=right){
            mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array length: \n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array inputs in ascending order: \n");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target number: \n");
        int target = sc.nextInt();

        int index = binarySearchClosest(arr, 0, n-1, target);

        System.out.print(index);

        sc.close();
    }
}