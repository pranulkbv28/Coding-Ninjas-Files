# Time Complexity for Insertion Sort

## What it does

- this sorting algorithm sorts elements by make `sub-arrays` and comparing the adjacent elements.
- after each iteration, the next element is added to the sub-array and they are compared.
- swapping of elements doesn't occus, rather the position of the elements shift until the right position for the new element is found.
- only then is a swapping function called.

## Big O notation

```
    Equation => T(N) = 1 + 2 + 3 + ...... + (n-2) + (n-1)
    => (n(n-1))/2
    => (n^2 - n)/2
```
- so this means, the `Big O` notation for Insertion Sort is O(n^2).
