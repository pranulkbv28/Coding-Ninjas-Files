import java.util.Scanner;

class SimpleInterest {
    public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		double r = sc.nextDouble();
		int t = sc.nextInt();

		int SI = (int) (p*r*t)/100;

		System.out.println(SI);
        sc.close();
	}    
}
