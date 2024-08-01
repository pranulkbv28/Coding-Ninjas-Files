# Time Complexity for Bubble Sort

## What it does

- compares adjacent elements and swaps them according to the user's needs.
- by the end of the `1st` iteration, the `largest/smallest` element gets sorted.
- this runs `n-1` times because the `last` element is only compared with its `previous` element and there is nothing after
- then, you move on to apply the same, but until `n-2` elements, and so on.

## Calculating the Time Complexity

- let us assume the `worst case scenario`, where the `swap` operation occurs at every step.
- This mean, there is always some `constant` work, `K1`, for initialsing just one time. -> `K1*1`
- some `constatnt` work, `K2`, happens for the `swap`, and this happens `n-1` times. -> `K2(n-1)`
- similarly, in the next, the same `swapping`, is done `n-2` times. This is because, the `last` element of the `previous` iteration is already `sorted`, and you do not have to consider it again after every `forthcoming` iteration. -> `K2(n-2)`
- this goes on until you are left with only `K2`.

## Big O notation

- from the `above` calculations, we can get this equation
  - `K1 + K2(n-1) + K2(n-2) + K2(n-3) + K2(n-4) + ..... + K2`
  - this can be written as
    - `K1 + K2((n-1)(n)/2)`
  - ignore `K1`, as it is not a dominating factor and also `2` for the same reasons
  - the new `equation will now be` -> `K2(n-1)(n)` => `K(n-1)(n)`, where `K` is some `constant`
  - => `K(n^2) - Kn`
  - => `K(n^2)`
- therefore, the `Big O` notation for `Bubble Sort` is `O(n^2)`.
