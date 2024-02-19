package DataStructures.ArrayListFolder;

import java.util.ArrayList;

public class IntroToArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10) ;
        arr.add(20);
        arr.add(30);
        System.out.println("\nThe array: "+arr);
        System.out.println(arr.size());
        System.out.println(arr.get(2));
        arr.add(1, 80);
        System.out.println("\nThe array after adding a new element in another index: "+arr);
        for(int j=0; j<arr.size();j++){
            System.out.print(arr.get(j)+" ");
        }
        System.out.println();
        System.out.println(arr.size());
        System.out.println(arr.get(2));
        arr.remove(2);
        System.out.println("\nThe array after removing a existing element: "+arr);
        Integer i = 10;
        arr.remove(i);
        System.out.println("\nThe array after removing an Integer object: "+arr);
        


        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println(arr1);
        //the default capacity before it has to increase of an ArrayList is 10

        ArrayList<Integer> arr2 = new ArrayList<>(20);
        System.out.println(arr2);
         //the starting capacity of arr2 is 20 and will increase after the 21st element and so on

        ArrayList<String> list = new ArrayList<String>() ;
        list.add( "Ant" );
        list.add( "Bat" );
        list.add( "Car" );
        list.add( "Door" );
        list.add( "Euro" );
        System.out.println("\n"+list);
        list.set(2, "Bus"); //this is used to replace the values of pre-existing values in an ArrayList
        System.out.println("\n"+list);
         
    }
}
