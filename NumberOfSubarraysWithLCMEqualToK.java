/*
    2470
    Given an integer array nums and an integer k, return the number of subarrays of nums where the least common multiple of the subarray's elements is k.

    A subarray is a contiguous non-empty sequence of elements within an array.

    The least common multiple of an array is the smallest positive integer that is divisible by all the array elements.

    

Example 1:

Input: nums = [3,6,2,7,1], k = 6
Output: 4
Explanation: The subarrays of nums where 6 is the least common multiple of all the subarray's elements are:
- [3,6,2,7,1]
- [3,6,2,7,1]
- [3,6,2,7,1]
- [3,6,2,7,1]
Example 2:

Input: nums = [3], k = 2
Output: 0
Explanation: There are no subarrays of nums where 2 is the least common multiple of all the subarray's elements.
 */

public class NumberOfSubarraysWithLCMEqualToK {

    public int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public int subarrayLCM(int[] nums, int k) {

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int runningLCM = nums[i];
            for (int j = i; j < nums.length; j++) {
                runningLCM = lcm(runningLCM, nums[j]);
                if (runningLCM > k) {
                    break;
                }
                if (runningLCM == k) {
                    result++;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}