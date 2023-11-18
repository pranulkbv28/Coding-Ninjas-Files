import java.util.Scanner;

class Average {
public static void main(String[] args) {
        //  take input 
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		// write your logic ...
        float avg = (a+b+c)/3;

        System.out.println(avg);
		sc.close();
    }    
}
