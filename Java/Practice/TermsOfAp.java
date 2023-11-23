// WAP to print first n terms of the series (3N+2) which are not a multiple of 4
// this means, the term from the series shouldn't be divisible by 4.

package Practice;

import java.util.Scanner;

class TermsOfAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to be printed: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int term = (3 * i) + 2;
            if (term % 4 == 0) {
                n++;
            }
            else{
                System.out.print(term+" ");
            }
        }

        sc.close();
    }
}
