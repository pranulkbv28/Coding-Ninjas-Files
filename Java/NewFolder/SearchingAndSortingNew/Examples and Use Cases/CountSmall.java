import java.util.*;

public class CountSmall {

    // public static int[] pushingCounts(int a[], int b[], int c[], int n, int m) {
    // int i = 0, j = 0, k = 0, count = 0; // end = 0;
    // while (i < n) {
    // if (i == 0) {
    // while (j < m) {
    // if (a[i] >= b[j]) {
    // count = count + 1;
    // j++;
    // } else {
    // break;
    // }
    // }
    // } else {
    // count = c[k - 1];
    // while (j < m) {
    // if (a[i] >= b[j]) {
    // count = count + 1;
    // j++;
    // } else {
    // break;
    // }
    // }
    // }
    // c[k++] = count;
    // i++;
    // }

    // return c;
    // }

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

    public static int[] countSmall(int a[], int b[], int n, int m) {
        insertionSort(a, n);
        insertionSort(b, m);
        int c[] = new int[n]; // this array has the size "n" because we have to check wrt to the elements of the 1st array.
        // int countArr[] = pushingCounts(a, b, c, n, m);
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < m && a[i] >= b[j]) {
                j++;
            }
            c[i] = j;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the 1st array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter the array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nEnter the length of the 2nd array: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("\nEnter the array elements: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int countArr[] = countSmall(a, b, n, m);
        System.out.println("\nThe count array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(countArr[i] + " ");
        }

        sc.close();
    }
}
