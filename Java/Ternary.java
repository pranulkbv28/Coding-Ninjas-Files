import java.util.*;

class Ternary {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        int num3 = sc.nextInt();


        int greatest = num1 > num2?(num1>num3?num1:num3):(num2>num3?num2:num3);

        System.out.println("The greatest number is: "+greatest);


        int x = 10;
        int y = 20;
        int z = (x>y)?x:(x<y)?y:0;

        System.out.println(z);


        sc.close();
    }    
}
