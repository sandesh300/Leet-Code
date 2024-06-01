# 88. Merge Sorted Array

- You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

- Merge nums1 and nums2 into a single array sorted in non-decreasing order.

- The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 
### Example 1:

- Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
- Output: [1,2,2,3,5,6]
- Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
- The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

### Example 2:

- Input: nums1 = [1], m = 1, nums2 = [], n = 0
- Output: [1]
- Explanation: The arrays we are merging are [1] and [].
- The result of the merge is [1].

### Example 3:

- Input: nums1 = [0], m = 0, nums2 = [1], n = 1
- Output: [1]
- Explanation: The arrays we are merging are [] and [1].
- The result of the merge is [1].
- Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

###  Constraints:

- nums1.length == m + n
- nums2.length == n
- 0 <= m, n <= 200
- 1 <= m + n <= 200
- -109 <= nums1[i], nums2[j] <= 109

### Detailed Explanation
- Initialization:

- i starts from the end of the initial elements of nums1.
- j starts from the end of nums2.
- k starts from the end of the total length of nums1.

- Comparison and Placement:

- Compare nums1[i] and nums2[j].
- Place the larger value at the end of nums1 (position k).
- Move the pointers accordingly.
- If nums1[i] is greater, move the i and k pointers.
- Otherwise, move the j and k pointers.

### Example Walkthrough
- Let's say nums1 has elements [1, 2, 3, 0, 0, 0] and nums2 has elements [2, 5, 6], with m = 3 and n = 3.

- Initialize i = 2, j = 2, k = 5.
- Compare nums1[2] (3) and nums2[2] (6):
- Place 6 in nums1[5].
- Decrement j to 1 and k to 4.
- Compare nums1[2] (3) and nums2[1] (5):
- Place 5 in nums1[4].
- Decrement j to 0 and k to 3.
- Compare nums1[2] (3) and nums1[1] (2):
- Place 3 in nums1[3].
- Decrement i to 1 and k to 2.
- Compare nums1[1] (2) and nums2[0] (2):
- Place 2 in nums1[2].
- Decrement j to -1 and k to 1.
- Now, j is -1, so the loop terminates.
- Final nums1 is [1, 2, 2, 3, 5, 6]. c