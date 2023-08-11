//1. Two Sum. 
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

 

import java.util.HashMap;
public class TwoSum 
{
    public int[] twoSum(int[] nums, int target)
     {
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++)
        {
        Integer reNum = (Integer)(target-nums[i]);

        if(hashmap.containsKey(reNum))
        {
            int toReturn[] = {hashmap.get(reNum),i};
            return toReturn;
        }
        hashmap.put(nums[i], i);
        }
        return null;
     }
}