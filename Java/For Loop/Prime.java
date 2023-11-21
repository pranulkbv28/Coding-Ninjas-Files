import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println(n+" is a Prime Number");
        }
        else{
            System.out.println(n+" is not a Prime Number");
        }
    }    
}
