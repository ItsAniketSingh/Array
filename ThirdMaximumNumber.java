/*
    414. Third Maximum Number
    Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
 */


public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
          long max2 = Long.MIN_VALUE;
          long max3 = Long.MIN_VALUE;
  
          for (int i : nums){
              if (i > max1){
                  max3 = max2;
                  max2 = max1;
                  max1 = i;
              } 
              
              else if (i > max2 && i < max1) {
                  max3 = max2;
                  max2 = i;
              } 
              
              else if (i > max3 && i < max2) {
                  max3 = i;
              }
          }
          
          if (max3 != Long.MIN_VALUE){
              return (int)max3;
          } 
  
          return (int)max1;
      }  
    public static void main(String[] args) {
        
    }
    
}
