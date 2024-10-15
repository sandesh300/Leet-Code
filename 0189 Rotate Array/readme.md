
# 189. Rotate Array

## Problem Description

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

### Example 1:

**Input:**  
`nums = [1,2,3,4,5,6,7]`  
`k = 3`

**Output:**  
`[5,6,7,1,2,3,4]`

**Explanation:**  
Rotate 1 step to the right: `[7,1,2,3,4,5,6]`  
Rotate 2 steps to the right: `[6,7,1,2,3,4,5]`  
Rotate 3 steps to the right: `[5,6,7,1,2,3,4]`

---

### Example 2:

**Input:**  
`nums = [-1,-100,3,99]`  
`k = 2`

**Output:**  
`[3,99,-1,-100]`

**Explanation:**  
Rotate 1 step to the right: `[99,-1,-100,3]`  
Rotate 2 steps to the right: `[3,99,-1,-100]`

---

## Constraints:

- `1 <= nums.length <= 10^5`
- `-2^31 <= nums[i] <= 2^31 - 1`
- `0 <= k <= 10^5`

---

## Approach

### Problem Understanding:

The problem asks to rotate the array to the right by `k` steps. When rotating right, the elements at the end of the array move to the beginning. We want to achieve this efficiently without using additional space or shifting the elements multiple times, especially for large arrays.

### Approach Explanation:

To rotate the array in-place, we can use a clever "reverse" approach. Here's how it works:

1. **Step 1: Handle large `k` values.**
   - Since rotating an array of length `n` by `n` steps brings the array back to its original position, rotating by `k` where `k > n` is equivalent to rotating by `k % n`. This ensures that the number of rotations is within the bounds of the array size.
   
2. **Step 2: Reverse the entire array.**
   - Reversing the entire array ensures that the last `k` elements (which need to move to the front) are now at the front in reversed order.

3. **Step 3: Reverse the first `k` elements.**
   - Reversing the first `k` elements puts them in their correct order at the front of the array.

4. **Step 4: Reverse the remaining elements.**
   - Reversing the remaining `n - k` elements restores their original order.

By following this process, we rotate the array in-place in O(n) time with O(1) additional space.

### Algorithm:

1. Calculate `k = k % n` where `n` is the length of the array.
2. Reverse the entire array.
3. Reverse the first `k` elements.
4. Reverse the remaining `n - k` elements.

### Code Implementation:

```java
class Solution {
    public void rotate(int[] nums, int k) {
        // Step 1: Handle large k values
        k %= nums.length;
        
        // Step 2: Reverse the entire array
        reverse(nums, 0, nums.length - 1);
        
        // Step 3: Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Step 4: Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }
    
    // Helper method to reverse elements between two indices
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
```

### Time Complexity:
- **O(n)**: We reverse the array three times, each operation taking O(n) where `n` is the length of the array.
  
### Space Complexity:
- **O(1)**: We only use a constant amount of extra space for temporary variables, and no additional arrays are used.

---

## Edge Cases:

- **When `k = 0`:** The array remains unchanged.
- **When `k >= nums.length`:** Rotating `k` steps is equivalent to rotating `k % nums.length` steps.
- **When `nums.length = 1`:** A single-element array remains the same regardless of `k`.

---

This approach ensures efficient in-place rotation without requiring additional space, making it suitable for large arrays.