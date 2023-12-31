/*   Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
*/

class Solution {

    //using recursion
    public int[] buildArray(int[] nums) {
        aPermutation(nums,0);

        return nums;
    }
    
    void aPermutation(int[] nums,int start){
        if(start<nums.length){
        int temp=nums[start];
        int result=nums[temp];
        aPermutation(nums,start+1);
        nums[start]=result;
    }
  
    }
}