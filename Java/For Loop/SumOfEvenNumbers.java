import java.util.Scanner;

class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); sc.close();
        Scanner s = new Scanner(System.in); s.close();
            int n = s.nextInt();
            int num = 0;
            int i;
            for(i=1;i<=n;i++){
                if(i%2==0){
				    num += i;
			    }
            }
		    System.out.println(num);
        s.close();
    }    
}
