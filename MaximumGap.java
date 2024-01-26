/*
    164. Maximum Gap
    Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.

    You must write an algorithm that runs in linear time and uses linear extra space.

    

Example 1:

Input: nums = [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
Example 2:

Input: nums = [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.
 */

import java.util.Arrays;

public class MaximumGap {
    
     public int maximumGap(int[] nums) {
        
        Arrays.sort(nums);
        int maxGap = 0;
        for(int i =0; i< nums.length - 1; i++){
            int diff = nums[i+1] - nums[i];
            maxGap = Math.max(maxGap, diff);
        }
        return maxGap;
    }
    public static void main(String[] args) {
        
    }
    
}
