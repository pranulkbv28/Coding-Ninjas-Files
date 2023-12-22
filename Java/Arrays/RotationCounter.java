package Arrays;

import java.util.Scanner;

class RotationCounter {
    public static void reverse(int []arr, int l, int r){
        while(r>l){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] =temp;

            l++;
            r--;
        }
    }
    public static void leftRotate(int arr[]){
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, arr.length-1-1);
        reverse(arr, arr.length-1-1, arr.length-1);
    }
    public static int roationCounter(int arr[]){
        int rotCount = 0;
        for(int i=0;i<(arr.length)-1;i++){
            for(int j=0;j<(arr.length-1);j++){
                if(j==i){
                    break;
                }
                else if(arr[j]>arr[i]){
                    leftRotate(arr);
                    rotCount++;
                }
            }
        }
        return rotCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(roationCounter(arr));
        sc.close();
    }    
}
