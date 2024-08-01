# Time Complexity

## Why do you need Time Complexity

- to figure out which algorithm will be the most suitable for a particular problem.
- helps us give us a qualitative amalysis on our approach to the problem.

## Theoretical Analysis

- using math to quantify how fast or slow each algorithm is.
- using a neutral test case to get the best analysis.
- we are not using experimental analysis as, certain test cases will be biased to one approach, hence not providing us with a `quantitative analysis`.

### Approach to perform Theoretical Analysis

- we use a `pseudo code`
- see how many operations an algorithm will do for an input size `n`
- `operations` are used as the proxy for `time`.
-  we do not consider the exact count, rather take the `structure` of the operations.
- while doing these kind of analyses, always take the `worst case scenario` into consideration.
- for example:

  - #### Pseudo code for `Factorial of a number`

  ``` java
    int a = 1;
    for(int i=0; i<n; i++){
        a *= a;
    }
    return a;
  ```

  - #### Number of Operations

    1. `assigning` value of `a`. -> let this be `1`
    2. `returning` value of `a`. -> let this be `1`
    3. inside the `for loop`, which runs `n` times
        - `assigning` the value of `i`. -> let this be `1`
        - `multiplying` and `assigning` the value of `a`. -> let this be `1`

  - #### Calculating the `operations`

    - 1 + 1 + n(1 + 1) = 2n + 2

### `Big O` notation

- we use this notation to easily quantify the structure and come up with a definitive value for the speed or the time taken for the algorithm to give us the solution
- for example, let's take an equation : `K1 + K2(n) + K3(n^2) + K4(log(n))`
  - in this, we can say that out of all the `terms` here, `K3(n^2)` is the most `dominating term` as when `n` increases, this value increases at a `faster rate`.
  - so, while telling your algorithm's speed, we have to always mention the `dominating term(s)`.

- #### Definition

  - an Algorithm `A`, is called `O(n^2)`, if the time taken by `A` for an input size `n` is `<=` `K(n^2)`, wher `K` is some `constatnt`.
  - `here, n^2 is just taken as an example`.
