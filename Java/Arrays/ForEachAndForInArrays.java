package Arrays;

class ForEachAndForInArrays {
    public static void main(String[] args) {
        int arr[] = {2, 3, 56, 345, 435, 345576, 77, 56, 6, 7, 55, 876, 54};
        for(int i:arr){
            System.out.print(i+" ");
            // here "i" is not the index, but the value of the array at that index
            // Output: 2 3 56 345 435 345576 77 56 6 7 55 876 54
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            // here, "i" is the index value of the array and not the value AT the index
            // Output: 2 3 56 345 435 345576 77 56 6 7 55 876 54
        }
    }    
}
