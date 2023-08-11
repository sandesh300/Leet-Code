// 35. Search Insert Position

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

public class SearchInsert 
{
    public int searchInsert(int[] nums, int target)
     {
        int l = 0;
        int r = nums.length;

      while(l < r)
     {
     final int m = (l + r) / 2;
     if(nums[m] == target)
        return m;
     if(nums[m] < target)
        l = m + 1;
     else
        r = m;
     }  
       return l;
  }
}