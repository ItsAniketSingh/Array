/*
    1979
    Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

    The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

 

Example 1:

Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.
Example 2:

Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.
 */

public class FindGreatestCommonDivisorOfArray {
    class Solution {
        public static int gcd(int a, int b){
            if(a == 0){
                return b;
            }
            return gcd(b%a, a);
    
    
        }
        public int findGCD(int[] nums) {
    
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    
            for(int i =0; i< nums.length; i++){
                if(nums[i] > max ){
                    max = nums[i];
                }
                if(nums[i] < min){
                    min = nums[i];
                }
            }
            return gcd(min, max);
            
        }
    }
    public static void main(String[] args) {
        
    }
}
