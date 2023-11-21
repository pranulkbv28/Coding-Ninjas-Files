import java.util.Scanner;

class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int num = 0;
        int i;
        for(i=1;i<=n;i++){
            num += i;
        }
        System.out.println("The sum of all number from 1 to "+ n + " is: "+ num);

        sc.close();

    }
    
}
