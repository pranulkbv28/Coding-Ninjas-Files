import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of the series: ");
        int count = sc.nextInt();
        int a = 0;
        int b = 1;
        // System.out.println("");8
        System.out.print(a+" "+b+" ");
        while(count>0){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
            count--;
        }

        sc.close();
    }    
}
