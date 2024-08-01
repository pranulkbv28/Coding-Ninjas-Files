import java.util.Scanner;

class LinearSearch {

    public static int search(int A[], int n) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == n) {
                // System.out.println(i);
                return i;
            }
        }
        // System.out.println("The element is not present.");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = { 5, 7, 1, 2, 33, 90, 87, 54, 12, 34, 78 };

        System.out.println("Enter the element to be searched: ");
        int n = sc.nextInt();
        int index = search(A, n);
        if (index == -1) {
            System.out.println("Element not present in the data set.");
        } else {
            System.out.println(index);
        }

        sc.close();
    }
}