package Arrays;

import java.util.Scanner;

class Rotation {
    public static void swap(int []a, int left, int right){
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;

    }
    public static int[] leftRotation(int []a, int rotCount){
        // this is reversing the array from index(0) to index((a.length)-rotCount-1)
        for(int l=0, r=((a.length)-rotCount-1);r>l;l++,r--){
            swap(a, l, r);
        }
        // this is reversing the array from index((a.length)-rotCount) to index((a.length)-1)
        for(int l=((a.length)-rotCount), r=((a.length)-1);r>l;l++,r--){
            swap(a, l, r);
        }
        return a;
    }
    public static int[] rightRoatation(int []a, int rotCount){
        // this is reversing the array from index(0) to  index(rotCount-1)
        for(int l=0, r=(rotCount-1);r>l;l++,r--){
            swap(a, l, r);
        }
        // this is reversing the array from index(rotCount) to  index((a.length)-1)
        for(int l=rotCount, r=((a.length)-1);r>l;l++,r--){
            swap(a, l, r);
        }
        return a;
    }
    public static int[] rotation(int []a, int rotation, int roationCount){
        if(rotation==1){
            return rightRoatation(a, roationCount); 
        }
        else{
            return leftRotation(a, roationCount);
        }
    }
    public static int[] reverse(int []a){
        for(int l=0, r=(a.length)-1; r>l; l++,r--){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the capacity of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the the array of "+n+" length: ");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int reversedArray[] = reverse(a);
        System.out.print("\n Enter the Roation Direction, 1 for Right Rotation and 0 for Left Rotation: ");
        int rotDir = sc.nextInt();
        System.out.print("\n Enter the Rotation count: ");
        int rotCount = sc.nextInt();
        int rotatedArray[] = rotation(reversedArray, rotDir, rotCount);
        System.out.println("The Rotated Array is: ");
        for(int i:rotatedArray){
            System.out.print(i+" ");
        }

        sc.close();
    }    
}
