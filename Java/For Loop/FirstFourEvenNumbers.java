import java.util.Scanner;

class FirstFourEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of even numbers to be printed: ");
        int n = sc.nextInt();
        // int loop = 0;

        // for(int i=1; i<50; i++){
        //     if(i%2==0){
        //         System.out.print(i+" ");
        //         loop++;
        //     }
        //     if(loop == n){
        //         break;
        //     }
        // }
        for(int i=1; i<=50; i++){
            if(i%2==0){
                if(n>0){
                    System.out.print(i+" ");
                    n--;
                }
            }
        }

        sc.close();
    }
}
