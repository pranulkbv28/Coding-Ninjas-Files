# Time Complexity for Linear Search

- since the algorithm, in the worst case, will run until the last or the `nth` element
- we can say that the time complexity is O(n).

# Time Complexity for Binary Search

- considering the `worst case scenario`, which either the element is `not present` or the `last element`.
- in this algorithm, each iteration, the lenth of the array is `halved`.
- so this means
  - `1st` iteration -> length = `n`
  - `2nd` iteration -> length = `n/2`
  - `3rd` iteration -> length = `n/4`
  - .
  - .
  - .
  - `nth` iteration-> length = `1` element
```
    Equation: (n/(2^0)) + (n/(2^1)) + (n/(2^2)) + (n/(2^3)) + .... + n/(2^x)
    => n/(2^x) = 1
    => n = 2^x
    => x = log(n)
```
- this means, the `Time Complexity` of `Binary Search` is `O(log(n))`
