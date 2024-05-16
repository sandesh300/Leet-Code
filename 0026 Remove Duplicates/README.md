
## 26. Remove Duplicates from Sorted Array

### Problem Statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in `nums`.

### Approach

The provided solution uses the Two Pointer technique. It initializes a pointer `j` to keep track of the position to place non-duplicate elements. Then it iterates through the array `nums` with another pointer `i`. For each element at index `i`, it checks if it's different from the element at index `j` (the last non-duplicate element found so far). If it's not a duplicate, it increments `j` and assigns the current element to the new position represented by `j`, effectively removing duplicates by overwriting them with non-duplicate elements. Finally, it returns the length of the new array, which is `++j`, indicating the count of unique elements in the array.

### Dry Run Example

Consider the example array `[1, 1, 2, 2, 3, 4, 4, 5]`:

- Initially, `j` is 0.
- As it goes through the array:
  - It finds the first duplicate '1', skips it.
  - Finds another '1', skips it.
  - Finds '2' (which is not a duplicate), moves it to position 1 (`j` becomes 1).
  - Continues with '2', '3', '4', '5'.
- After the loop:
  - `j` is at position 4.
  - The new array is `[1, 2, 3, 4, 5, 4, 4, 5]`.
- Returns `++j`, which is 5, indicating there are 5 unique elements in the array.

### Complexity Analysis

- Time complexity: O(n), where n is the length of the input array `nums`.
- Space complexity: O(1), as the algorithm modifies the input array in-place without using any additional data structures.
