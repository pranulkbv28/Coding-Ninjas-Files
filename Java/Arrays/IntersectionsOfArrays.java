package Arrays;

import java.util.Scanner;

class IntersectionsOfArrays {
    public static void intersections(int arr1[], int arr2[]){
        int count =0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                    break;
                }
            }
        }
        int []inter = new int[count];
        int index=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    inter[index++]=arr2[j];
                    break;
                }
            }
        }
        for(int i:inter){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        intersections(arr1, arr2);
        sc.close();
    }    
}
