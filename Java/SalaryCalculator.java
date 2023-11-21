import java.util.*;
// import java.lang.*;
// import java.util.Scanner;

class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basicSalary = input.nextInt();
        char grade = input.next().toUpperCase().charAt(0);
        // char upperGrade = Character.toUpperCase(grade);
        // int charValue = (int) upperGrade;
        double hra = 0.2 * basicSalary;
        // changed the multiplier in their decimal formal
        double da = 0.5 * basicSalary;
        // System.out.println(da);
        double allow = 0;

        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }
        // converted into decimal
        double pf = 0.11 * basicSalary;

        double totalSalary = basicSalary + hra + da + allow - pf;
        // added the typecasting line on print statement with rounded off number
        System.out.println((int) Math.round(totalSalary));

        input.close();
    }
}
