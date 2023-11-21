import java.util.Random;
import java.util.Scanner;

public class GuessTheRightNumber {
    public static void main(String[] args) {
        // int randomNumber = (int) Math.floor((Math.random()*9)+1);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("The right answe is: "+randomNumber);
        Scanner sc = new Scanner(System.in);
        // int randomNumber = 4;
        int guessedNumber;
        
        do{
            System.out.print("Enter any number between 1-10: ");
            guessedNumber = sc.nextInt();
            // sc.close();
        }
        while(guessedNumber!=randomNumber);
        sc.close();

        
    }    
}
