## Two Sum

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

### Example 1:

**Input:** `nums = [2,7,11,15]`, `target = 9`

**Output:** `[0,1]`

**Explanation:** Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

### Example 2:

**Input:** `nums = [3,2,4]`, `target = 6`

**Output:** `[1,2]`

### Example 3:

**Input:** `nums = [3,3]`, `target = 6`

**Output:** `[0,1]`

### Constraints:

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.

## Approach

### - Add two indexes and equals to target

## Solution Explanation

**Initialization:**

- `int[] ans = new int[2];`: Initializes an array `ans` of size 2 to store the indices of the two numbers that add up to the target.

**Looping through the array:**

- `for(int i = 0; i < nums.length; i++)`: Outer loop iterates through each element of the input array `nums`.
- `for(int j = i+1; j< nums.length; j++)`: Inner loop starts from the next element of the outer loop, ensuring each pair is checked only once.

**Checking if a pair adds up to the target:**

- `if(nums[j] + nums[i] == target)`: Checks if the sum of `nums[i]` and `nums[j]` equals the target.

**Storing the indices:**

- If a pair is found, stores the indices `i` and `j` in the result array `ans`.

**Returning the result:**

- If a valid pair is found, returns the result immediately.
- If no valid pair is found, returns the initialized result array.

This algorithm has a time complexity of O(n^2) due to the nested loops, where n is the length of the input array.
