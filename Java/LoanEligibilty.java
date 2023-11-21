import java.util.Scanner;

class LoanEligibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double income = sc.nextDouble();
        boolean loans = sc.nextBoolean();

        if((age>=18)&&(income>=2000)&&(loans==false)){
            System.out.println("You are eligible for the loan.");
        }
        else{
            System.out.println("You are not eligible for the laon.");
        }
        sc.close();
    }    
}
