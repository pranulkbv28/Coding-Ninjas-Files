package SearchingAndSortingNew.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestIndex {
    public static int binarySearch(int A[], int n) {
        int l = 0, r = A.length - 1;
        int diff = Integer.MAX_VALUE;
        // int index=0;
        while (l <= r) {
            int mid = (l + r) / 2;
            int initialDiff = diff;
            diff = Math.abs(n - mid);
            if (A[mid] > n) {
                r = mid - 1;
            } else if (A[mid] < n) {
                l = mid + 1;
            }
            if (initialDiff < diff) {
                diff = initialDiff;
            }
        }
        // this is a test message
        return Math.abs(diff - n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = { 5, 7, 1, 2, 33, 90, 87, 54, 12, 34, 78 };
        Arrays.sort(A);

        int n = sc.nextInt();

        System.out.println(binarySearch(A, n));

        sc.close();
    }
}
