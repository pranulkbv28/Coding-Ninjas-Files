import java.util.*;

public class InversionAndSum {

    public static void swap(int arr[], int a, int b){
        int temp = int arr[a];
        int arr[a] = int arr[b];
        int arr[b] = temp;
    }

    public static int toSortAndSum(int arr[], int n){
        int sum=0;
        for(int i=0; i<n-1; i++){
            int minPointer = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minPointer]){
                    minPointer = j;
                }
            }
            sum = sum + (minPointer-i);
            swap(arr, i, minPointer);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("\nEnter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int totalInversionSum = toSortAndSum(arr, n);
        System.out.print("The total inversion sum is: " + totalInversionSum);

        sc.close()
    }

}
