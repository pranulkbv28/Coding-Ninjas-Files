import java.util.*;

public class FindPairWithSmallestDifference {

    public static void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }

    public static int smallestDiiference(int a[], int b[], int n, int m) {
        insertionSort(a, n);
        insertionSort(b, m);
        int minDiff = Math.abs(a[0] - b[0]);
        for (int i = 0, j = 0; i < n && j < m;) {
            minDiff = Math.min(minDiff, Math.abs(a[i] - b[j]));
            if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the 1st array: ");
        int n = sc.nextInt();
        System.out.print("Enter the length of the 2nd array: ");
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];
        System.out.print("\nEnter the elements of the 1st array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("\nEnter the elements of the 2nd array: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int minDiff = smallestDiiference(a, b, n, m);
        System.out.println("\nThe smallest difference is: " + minDiff);

        sc.close();
    }
}
