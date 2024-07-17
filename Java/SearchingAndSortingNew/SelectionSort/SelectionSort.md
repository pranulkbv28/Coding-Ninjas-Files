# Selection Sort

## Rules to Follow
- for ascending order find the `smallest element` and `swap` it with the `1st element` of the array.
- continue to do so to get the `sorted array`.

## Approach
- initalize a `minPointer`.
- find the smallest element in that `iteration`.
- swap the elemnt at `minPointer` with the `1st element`.
- in the next iteration start from the `2nd element` (because the `1st element` is already sorted).
- now find the smallest element and assign it to `minPointer`.
- swap it with the `2nd element` of the array.
- continue to do it until you get the `sorted` array.

## Pseudo Code
``` java
    // Outer Pass Loop
    for(int i=0; i<arr.length-1; i++){
        int min=i;
        // Inner Loop for finding min value index
        for(int j=i+1; j<arr.length; j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        swap(arr, i, min)
    }
```