# Insertion Sort

## Rules to follow

- the number of passes to be done is `arr.length - 1`.
- the inner loop is not fixed.

## Approach

- take an array and keep checking if its `sub-arrays` are sorted one-by-one.
  - by sub-arrays, I mean,
    - for the `1st iteration`, take the `1st` and the `2nd` elements of the array.
    - for the `2nd iteration`, add the `next` element to the `previous` group.
  - you have to sort them after each addition of the `new element` or `new sub-array`.
    - during sorting, when we are swapping the elements according to our precedence, it is done by comparing `each adjacent element`.
      - this means, when a new group is created, we have to compare it with all its adjacent element and swap it accordingly.
      - do not swap at each comparison, but rather `shift` the element(according to your precedence), as it computationally less tedious.
- through all the iterations, we will end up with a `sorted sub-array`. Check with a pen and paper for more intuition on this.

## Pseudo Code

``` java
    // Outer Loop
    for(int i=1; i<n: i++){
        int temp = arr[i];
        int j = i-1;
        for(; j>=0; j--){
            if(temp<arr[j]){
                arr[j+1] = arr[j];
            } else {
                break;
            }
        }
        arr[j+1] = temp; // this is done to place the new element in the correct position.
        // it is "j+1" because after the end of the 2nd loop, j will be pointing at either -1 or an element already sorted. 
    }
```
