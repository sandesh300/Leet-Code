# 283. Move Zeroes

## Problem Description

Given an integer array `nums`, you are tasked with moving all `0`s to the end of the array while maintaining the relative order of the non-zero elements. This should be done **in-place**, meaning no extra space (such as a copy of the array) should be used.

### Example 1:

- **Input**: `nums = [0,1,0,3,12]`
- **Output**: `[1,3,12,0,0]`

### Example 2:

- **Input**: `nums = [0]`
- **Output**: `[0]`

### Constraints:

- `1 <= nums.length <= 10^4`
- `-2^31 <= nums[i] <= 2^31 - 1`

## Approach

To solve this problem efficiently while keeping the space complexity minimal (in-place), we can use a two-pointer approach. The idea is to iterate over the array with two pointers, one for iterating through the array (`i`) and the other for tracking the position of the next non-zero element (`j`). We swap non-zero elements to their correct position as we traverse the array.

### Key Points:
1. **Two-Pointer Approach**:
   - `j` is used to track the position where the next non-zero element should be placed.
   - `i` is used to iterate through the array.

2. **Swap Logic**:
   - For each element in the array:
     - If the element is non-zero, it is swapped with the element at index `j`.
     - `j` is incremented after each swap, ensuring that the non-zero elements are placed at the beginning of the array.
     - Zero elements are left in their positions and will be moved towards the end as we swap non-zero values.
   
3. **In-place Modification**:
   - The array is modified in-place, meaning no additional arrays or extra space are used.
   - This ensures that the solution is space-efficient.

### Algorithm:

1. Initialize a pointer `j = 0` to track the next position for the non-zero elements.
2. Iterate through the array using a pointer `i` from the start to the end of the array.
   - If `nums[i]` is non-zero:
     - Swap `nums[i]` with `nums[j]`.
     - Increment `j` by 1.
3. Continue this until the entire array has been processed.

By the end of this process:
- All non-zero elements will be at the beginning of the array, in their original relative order.
- All `0`s will be shifted towards the end of the array.

### Time Complexity:
- **O(n)**, where `n` is the length of the array. We only pass through the array once.

### Space Complexity:
- **O(1)**, since the solution modifies the input array in-place and does not use any additional space.

### Example Walkthrough:

#### Input: `nums = [0, 1, 0, 3, 12]`

1. **Initialization**: `j = 0`
2. **Iteration**:
   - `i = 0`, `nums[i] = 0`: No change, `j` remains `0`.
   - `i = 1`, `nums[i] = 1`: Swap `nums[1]` and `nums[0]`, array becomes `[1, 0, 0, 3, 12]`, `j = 1`.
   - `i = 2`, `nums[i] = 0`: No change, `j` remains `1`.
   - `i = 3`, `nums[i] = 3`: Swap `nums[3]` and `nums[1]`, array becomes `[1, 3, 0, 0, 12]`, `j = 2`.
   - `i = 4`, `nums[i] = 12`: Swap `nums[4]` and `nums[2]`, array becomes `[1, 3, 12, 0, 0]`, `j = 3`.
   
3. **Result**: `[1, 3, 12, 0, 0]`

### Code Implementation:

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // Pointer for tracking the next non-zero position
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element with the element at position 'j'
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++; // Move 'j' to the next position
            }
        }
    }
}
```

## Conclusion

This solution provides an efficient in-place algorithm to move all zeros in an array to the end while maintaining the order of non-zero elements. The two-pointer approach ensures that we complete this task in linear time with constant space complexity.