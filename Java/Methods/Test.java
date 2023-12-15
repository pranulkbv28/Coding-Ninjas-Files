package Methods;

import java.util.*;
public class Test{
    
    public static boolean is_prime(int num){
        if(num==2){
            return false;
        }
        else{
            for(int i=2;i<=num;i++){
                if(num!=i  && num%i==0){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void print_composite(int n)
    {
        // write your code logic here 
        for(int i=2;i<=n;i++){
            if(is_prime(i)==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        print_composite(limit);
       sc.close(); 
    }
}
