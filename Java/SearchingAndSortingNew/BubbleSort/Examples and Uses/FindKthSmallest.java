import java.util.*;

public class FindKthSmallest {

    public static void swap(int a, int b, int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int kthSmallestElement(int arr[], int n, int k){
        int i=n;
        while(i-k+1 > 0){
            for(int j=0; j < i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(j, j+1, arr);
                }
            }
            i--;
        }
        
        return arr[k-1];
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("\nEnter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnter the kth smallest element you want to find: ");
        int k = sc.nextInt();

        System.out.print("\nThe "+k+"th smallest element is: "+kthSmallestElement(arr, n, k));

        sc.close();
    }

}
