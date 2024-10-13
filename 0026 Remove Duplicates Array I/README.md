

# 26. Remove Duplicates from Sorted Array

## Problem Statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates **in-place** such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in `nums`.

It does not matter what you leave beyond the returned `k` (hence they are underscores `_`).

### Example 1:

- **Input:** `nums = [1,1,2]`
- **Output:** `2, nums = [1,2,_]`
- **Explanation:** Your function should return `k = 2`, with the first two elements of `nums` being `1` and `2` respectively. It doesn't matter what is left beyond the returned `k`.

### Example 2:

- **Input:** `nums = [0,0,1,1,1,2,2,3,3,4]`
- **Output:** `5, nums = [0,1,2,3,4,_,_,_,_,_]`
- **Explanation:** Your function should return `k = 5`, with the first five elements of `nums` being `0, 1, 2, 3, and 4` respectively. It doesn't matter what is left beyond the returned `k`.

### Constraints:

- `1 <= nums.length <= 30,000`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in non-decreasing order.

---

## Approach: Two Pointers

The problem can be efficiently solved using the **Two Pointers** technique. Here's the intuition:

- We use two pointers: `i` and `j`. Pointer `i` will keep track of the last unique element in the array, while pointer `j` will traverse the array to find the next unique element.
- Whenever a new unique element is found at `j`, we increment `i` and update `nums[i]` with the unique element found at `j`.

### Algorithm Steps:

1. Initialize a variable `i = 0`, which will point to the last unique element.
2. Iterate over the array using pointer `j` from `1` to `nums.length - 1`.
3. For each `j`, compare `nums[j]` with `nums[i]`:
   - If `nums[j] != nums[i]`, increment `i` and assign `nums[i] = nums[j]`.
4. After the loop completes, the first `i + 1` elements in the array will be unique.
5. Return `i + 1` as the number of unique elements.

---

## Time and Space Complexity

- **Time Complexity:** `O(n)`, where `n` is the number of elements in the array. We are traversing the array once, so the time complexity is linear.
- **Space Complexity:** `O(1)`. We are modifying the array in-place, without using extra space for another data structure.


