package Test2;

import java.util.Scanner;

public class LeadersInArray {
    public static void findLeader(int []a){
        System.out.print(a[a.length-1]+" ");
        for(int i=a.length-2;i>0;i--){
            boolean isGreater = true;
            for(int j=i;j<a.length;j++){
                if(a[i]<a[j]){
                    isGreater = false;
                }
            }
            if(isGreater){
                    System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        findLeader(a);
        sc.close();
    }
}
