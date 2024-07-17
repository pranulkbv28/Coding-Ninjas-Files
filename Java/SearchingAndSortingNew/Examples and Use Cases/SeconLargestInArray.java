import java.util.*;

public class SeconLargestInArray {

    public static int secondLargest(int arr[], int n) {
        int i = 0;
        while (i < 2) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            i++;
        }

        return arr[n - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("\nEnter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLargestNumber = secondLargest(arr, n);
        System.out.println("\nThe second largest number in the array is: " + secondLargestNumber);

        sc.close();
    }
}
