import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        // write your code ..
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = sc.nextInt();

        if(score<=100 && score>=90){
            System.out.println("A");
         }
         else if(score<=89 && score>=80){
            System.out.println("B");
         }
         else if(score<=79 && score>=70){
            System.out.println("C");
         }
         else if(score<=69 && score>=60){
            System.out.println("D");
         }
         else if(score<=59 && score>=0){
            System.out.println("F");
         }
         else{
            System.out.println("Invalid Score");
         }


        sc.close();
    }
}
