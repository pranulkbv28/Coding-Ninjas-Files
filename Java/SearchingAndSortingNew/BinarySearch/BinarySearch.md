# Binary Search

## Rules to follow

- binary Search only works on sorted Arrays or Lists (either ascending or descending)
- it is done with a two pointer approach (one at the beginning of the array `r`(index n-1) and the other at the end of the array `l` (index 0) )

## Approach

- we find out the mid point of the array or the middle index.
  - to do so we do `mid = (r+l)/2`
- then we check if the element at the middle index is equal to the key
  - `array[mid] == key`
- if it is true, then we return the index
- if not, we check if the key is greater or lesser than the element at the middle index
  - if lesser, the value of `r` remains as it is and the value of `l` is made one less than `mid` (not the element, but the index)
  - if greater, the value of `l` remains as it is and the value of `r` is made one more than `mid` (not the element, but the index)
- continue to do this until either `array[mid] == key`, or `r > l` is still true

## Pseudo Code

``` java
    int l = 0, r = array.length-1;
    for(int i = 0; r => l; i++){
        int mid = (r+l)/2;
        if(array[mid] == key){
            return mid;
        }
        else if(array[mid] > key){
            r = mid-1;
        }
        else{
            l = mid+1;
        }
    return -1;
    }
```
