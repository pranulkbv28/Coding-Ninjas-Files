# Time Complexity for Selection Sort

## What it does

- we need to take the `minimum` of the entire list and put it in the `1st` place.
- in the next iteration, we put the smallest element (cosidering all the elements except for the `1st`, as it is already sorted) in the `2nd` place.
- in the `1st` iteration, the algo runs for `n-1` times, and in the `2nd` iteration, it runs for `n-2` times, and so on.


## Big O notation

``` 
    Equation => T(N) = K1 + K2(n-1) + K2(n-2) + K2(n-3) + K2(n-4) + ..... + K2
   => K1 + K2(n(n-1)/2)
   => K1 + K2((n^2) - n)/2
   => K2(n^2)
```
- so this means, the `Big O` notation for Selection Sort is O(n^2).
