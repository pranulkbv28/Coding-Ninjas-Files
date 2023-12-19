package Arrays;

import java.util.Scanner;

class ReturnArraySum {
    public static int sum(int []arr){
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Arrays: ");
        int n = sc.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++){
            System.out.print("Enter the size of the Array: ");
            int size = sc.nextInt();
            System.out.println("Enter the Array elements: ");
            int arr[] = new int[size];
            for(int j =0;j<arr.length;j++){
                arr[j] = sc.nextInt();
            }
            System.out.println("\nThe sum of tall the elements of the Araay is: "+sum(arr));
        }
        // String a = "a"+"b";
        // System.out.println(a);

        sc.close();
    } 
}
