# Bubble Sort

## Rules to Follow
- there will be a total of `n-1` number of iterations at max for `Bubble Sort`.
- the max number of comparisons `n - iterationNumber`.

## Approach
- start from the very first element `index 0` and compare it with the adjacent element and sort accordingly.
    - for sorting in ascending order, we will swap the elements if the adjacent element is lesser than the starting element
    - for sorting in descending order, we will swap the elements if the adjacent element is greater than the starting element
- the new position for the pointer is at `index 1` and compare and implement swap if the condition is met.
- continue this until you reach the final index of the array.
- by now, we will have the `largest` element `bubbled out` at the last index.
- similarly in the next iteration you will `bubble out` the `second largest` element.
- continue this until the entire array is `sorted`.

## Pseudo Code
``` java
    int i = 0;
    while(i < (arr.length - 1)){
        for(int j = 0; j < (arr.length-i-1); j++){
            if(arr[j] > arr[j+1]){
                swap(arr[j], arr[j+1]);
            }
        }
        i++;
    }
```