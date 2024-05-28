package SearchingAndSortingNew.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int A[], int n) {
        int l = 0, r = A.length - 1;
        for (; l <= r;) {
            int mid = (l + r) / 2;
            if (A[mid] == n) {
                return mid;
            } else if (A[mid] > n) {
                r = mid - 1;
            } else if (A[mid] < n) {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = { 5, 7, 1, 2, 33, 90, 87, 54, 12, 34, 78 };
        Arrays.sort(A);

        System.out.println("Enter the element to be searched: ");
        int n = sc.nextInt();
        System.out.println(binarySearch(A, n));

        sc.close();
    }
}
