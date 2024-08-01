import java.util.*;

public class BubbleSort {

    public static void swap(int a, int b, int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] toBubbleSort(int arr[], int n){
        int i =0;
        while(i<n){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    swap(j, j+1, arr);
                }
            }
            i++;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("\nEnter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sortedArr[] = toBubbleSort(arr, n);
        System.out.print("Sorted array is: \n");
        for(int i : sortedArr){
            System.out.print(i + " ");
        }

        sc.close();
    }
}
