import java.util.*;

public class SelectionSort {

    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] toSelectionSort(int arr[], int n){
        // Outer Pass Loop
        for(int i=0; i<n-1; i++){
            // Initialize minPointer
            int minPointer = i; //this is the index of the min value and not the value itself.
            // Inner Loop to find the min value index
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minPointer]){
                    minPointer = j; //this is assigning the new min value index.
                }
            }
            swap(arr, minPointer, i);
        }
        
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("\nEnter the array elements: ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sortedArr[] = toSelectionSort(arr, n);
        System.out.print("The sorted array is: \n");
        for(int i:sortedArr){
            System.out.print(i + " ");
        }

        sc.close();
    }

}
