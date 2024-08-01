# Bubble Sort

## Rules to Follow

- there will be a total of `n-1` number of iterations at max for `Bubble Sort`.
- the max number of comparisons `n - iterationNumber`.

## Approach

- Start from the very first element (index 0) and compare it with the adjacent element.
  - For sorting in ascending order, swap the elements if the adjacent element is lesser than the starting element.
  - For sorting in descending order, swap the elements if the adjacent element is greater than the starting element.
- Move the pointer to the new position (index 1) and repeat the comparison and swap process.
- Continue this until you reach the final index of the array.
- By now, the largest element will be "bubbled out" at the last index.
- In the next iteration, repeat the process to find the second-largest element.
- Continue until the entire array is sorted.

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
