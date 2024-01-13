package ClassesAndobjects.PlayingWithFractions;

import java.util.Scanner;

public class GetFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator1 = sc.nextInt();
        int denominator1 = sc.nextInt();
        Fraction f1 = new Fraction(numerator1, denominator1);
        int numerator2 = sc.nextInt();
        int denominator2 = sc.nextInt();
        Fraction f2 = new Fraction(numerator2, denominator2);
        f1.print();
        f2.print();
        // f1.increment();
        // f1.print();
        f1.add(f2);
        f1.print();
        
        sc.close();
    }
}
