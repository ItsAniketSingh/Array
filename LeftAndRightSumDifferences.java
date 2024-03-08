/*
    2574. Left and Right Sum Differences

    Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:
leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.

 

Example 1:
Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

Example 2:
Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].

 */
public class LeftAndRightSumDifferences {


    public int[] leftRightDifference(int[] nums) {
        int[] sum=new int[nums.length];
        int leftsum,rightsum;
        leftsum=rightsum=0;

        //calulate total sum
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }

        for(int i=0;i<nums.length;i++){
           leftsum=rightsum=0;
            int num=nums[i];

        //calculate leftsum
                if(i==0) leftsum=0;
                else{
                    for(int j=0;j<i;j++) leftsum+=nums[j];
                }
        //calculate rightsum
             rightsum=totalsum-leftsum-num;

            sum[i]=Math.abs(leftsum-rightsum);
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }    
}
