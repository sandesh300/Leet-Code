## 27. Remove Element

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

0 <= nums.length <= 100
0 <= nums[i] <= 50
0 <= val <= 100

## Approach : two pointer technique 

## Code Explanation : 
The RemoveElement class contains a single method removeElement which takes an integer array nums and an integer val as parameters. The goal of this method is to remove all instances of val from the array nums and return the new length of the array after removal. Note that the array is modified in place, and the elements beyond the new length can be ignored.

Here's a breakdown of the method:

- Initialization:count is initialized to 0. This variable keeps track of the position in the array where the next element (that is not val) should be placed.

- Iterating through the array:A for loop iterates over each element in the array using the index i.

- Condition to check if the current element is not equal to val:Inside the loop, there is an if statement that checks if nums[i] is not equal to val.

- Placing the element in the correct position:If the condition is true, the current element (nums[i]) is assigned to nums[count], and count is incremented by 1.

- Return the new length:After the loop completes, count contains the number of elements that are not val. This is returned as the new length of the array.

### Time Complexity : O(n)
### Space Complexity : O(1)

## Dry Run
- Initial state:
nums = [3, 2, 2, 3]
val = 3
count = 0

- Iteration 1 (i = 0):
nums[0] = 3, which is equal to val.
Condition nums[i] != val is false.
count remains 0.

- Iteration 2 (i = 1):
nums[1] = 2, which is not equal to val.
Condition nums[i] != val is true.
nums[count] = nums[1] -> nums[0] = 2.
Increment count to 1.
nums becomes [2, 2, 2, 3] (updated in place).

- Iteration 3 (i = 2):
nums[2] = 2, which is not equal to val.
Condition nums[i] != val is true.
nums[count] = nums[2] -> nums[1] = 2.
Increment count to 2.nums remains [2, 2, 2, 3] (no visible change).

- Iteration 4 (i = 3):
nums[3] = 3, which is equal to val.
Condition nums[i] != val is false.
count remains 2.

- Final state:
nums = [2, 2, 2, 3] (relevant part is [2, 2]).
count = 2 

### Output:
- The method returns count which is 2.
- The array up to index count (i.e., nums[0] to nums[1]) contains the elements [2, 2].

Thus, the elements equal to val (which is 3) are removed, and the new length of the array is 2. The array is modified in place, and the relevant part up to the new length contains the elements [2, 2].