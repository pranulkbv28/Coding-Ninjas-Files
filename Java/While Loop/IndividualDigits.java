import java.util.Scanner;

class IndividualDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        while(num!=0){
            System.out.println(num%10);
            num = num/10;
        }
        sc.close();
    }    
}
