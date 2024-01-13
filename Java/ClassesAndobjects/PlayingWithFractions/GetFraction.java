package ClassesAndobjects.PlayingWithFractions;

import java.util.Scanner;

public class GetFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        Fraction f1 = new Fraction(numerator,denominator);
        f1.print();
        f1.increment();
        f1.print();

        sc.close();
    }
}
