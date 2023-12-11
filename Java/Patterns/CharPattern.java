package Patterns;
import java.util.*;

public class CharPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            // char ch = 'A';
            for(int j=0;j<rows;j++){
                int rowCounter = i;
                char charToBePrinted = (char) ('A'+rowCounter-1);
                System.out.print(charToBePrinted);
            }
            System.out.println();
        }

        sc.close();
    }
}
