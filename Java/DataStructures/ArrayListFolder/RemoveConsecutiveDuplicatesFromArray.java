package DataStructures.ArrayListFolder;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveConsecutiveDuplicatesFromArray {

    public static ArrayList<Integer> removeConsecutiveDuplicates(int []arr){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(removeConsecutiveDuplicates(arr));
        sc.close();
    }
}
