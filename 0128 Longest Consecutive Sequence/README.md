# 128. Longest Consecutive Sequence

## Problem Statement

Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

## Examples

### Example 1:
- **Input:** `nums = [100, 4, 200, 1, 3, 2]`
- **Output:** `4`
- **Explanation:** The longest consecutive elements sequence is `[1, 2, 3, 4]`. Therefore its length is `4`.

### Example 2:
- **Input:** `nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]`
- **Output:** `9`

## Constraints

- `0 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`

## Time and Space Complexity

### Time Complexity
The time complexity of the algorithm is O(n log n) due to the sorting step. Although the problem requires an O(n) solution, the provided implementation sorts the array, which takes O(n log n) time. The subsequent traversal of the array takes O(n) time, but the overall complexity is dominated by the sorting step.

### Space Complexity
The space complexity of the algorithm is O(1) because it uses a constant amount of extra space, regardless of the input size.

## Logic to Solve the Problem

1. **Check for Empty Array**: If the input array `nums` is empty, return 0.
2. **Sort the Array**: Sort the array `nums`.
3. **Initialize Counters**: Initialize two counters, `max` to keep track of the maximum length of consecutive sequence found, and `count` to count the current consecutive sequence length.
4. **Traverse the Array**: Iterate through the sorted array:
    - If the current element is not equal to the previous element:
      - If the current element is one more than the previous element, increment the `count`.
      - Otherwise, update `max` with the maximum of `max` and `count`, and reset `count` to 1.
5. **Return Result**: After the loop, return the maximum of `max` and `count`.

## Dry Run

### Example: `nums = [100, 4, 200, 1, 3, 2]`

1. **Initial Array**: `[100, 4, 200, 1, 3, 2]`
2. **Sorted Array**: `[1, 2, 3, 4, 100, 200]`
3. **Initialize**: `max = 1`, `count = 1`
4. **Iteration**:
    - `i = 1`: `nums[1] = 2`, `nums[0] = 1` → `count = 2`
    - `i = 2`: `nums[2] = 3`, `nums[1] = 2` → `count = 3`
    - `i = 3`: `nums[3] = 4`, `nums[2] = 3` → `count = 4`
    - `i = 4`: `nums[4] = 100`, `nums[3] = 4` → `max = 4`, `count = 1`
    - `i = 5`: `nums[5] = 200`, `nums[4] = 100` → `count = 1`
5. **Result**: `max = 4`

The longest consecutive elements sequence is `[1, 2, 3, 4]`, and its length is `4`.