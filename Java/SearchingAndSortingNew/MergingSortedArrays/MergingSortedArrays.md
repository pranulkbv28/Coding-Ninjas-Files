# Merging Sorted Arrays

## Rules to follow
- the arrays given are to be in a `sorted` manner.


## Approach
- start off by creating a new array, `sortedArr`, with the length `n+m`, where `n` is the length of `arr1` and `m` is the length of `arr2`.
- intialise `3 pointers`, `i`, `j`, and `k`, to `arr1`, `arr2`, and `sortedArr`, respectively.
- compare the elements at `i` and `j` and place the `smallest` element at the position of `k`.
    - if the element was from `i`th position, move the `i` pointer to `i+1`.
    - if the element was from `j`th position, move the `j` pointer to `j+1`.
- after incrementing the pointers of the required array, increment `k` to `k+1` as well. This is because, our next element needs to be added at the next position.
- this form of comparison is done until the lengths if `arr1` and `arr2`. When either of them are out of element, we can jjust copy the remaining elements from the `bigger array` to the `sortedArr`.

## Pseudo Code
``` java
    int[] sortedArr = new int[arr1.length + arr2.length];
    int i = 0, j = 0, k = 0;

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            sortedArr[k++] = arr1[i++];
        } else {
            sortedArr[k++] = arr2[j++];
        }
    }

    while (i < arr1.length) {
        sortedArr[k++] = arr1[i++];
    }

    while (j < arr2.length) {
        sortedArr[k++] = arr2[j++];
    }
```