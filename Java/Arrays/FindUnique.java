package Arrays;

import java.util.Scanner;

class FindUnique {
    public static int toFindUnique(int[] arr){
        // int unique = arr[0];
        // int size = arr.length;
        // for(int i=0;i<size;i++){
        //     for(int j=0;j<size;j++){
        //       if(arr[i]==arr[j]){
        //         if(i!=j){
        //           arr[i]=0;
        //           arr[j]=0;
        //         }
        //       }
        //     }
        // }
        // for(int i=0;i<size;i++){
        //     if(arr[i]!=0){
        //         unique = arr[i];
        //     }
        // }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((i!=j) && (arr[i]==arr[j])){
                    break;
                }
                if(j==(arr.length-1)){
                    return arr[i];
                }
            }
        }

        return -1;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of Arrays: ");
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
            System.out.println(toFindUnique(arr));
        }

        sc.close();
    }
}

