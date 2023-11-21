import java.util.Scanner;

class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be reversed: ");
        int num = sc.nextInt();
		if(num==0){
			System.out.println(num);
		}
		else{
			while(num%10==0){
			num = num/10;
			}
			while(num!=0){
			System.out.print(num%10);
			num = num/10;
			}
		}

        sc.close();
    }    
}
