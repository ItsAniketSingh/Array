/*
    3005. Count Elements With Maximum Frequency
    You are given an array nums consisting of positive integers.

    Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

    The frequency of an element is the number of occurrences of that element in the array.

    

Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.

Example 2:

Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.

 */

public class CountElementsWithMaximumFrequency {

    public int maxFrequencyElements(int[] nums) {
        int a[]=new int[101];
        for(int i:nums)
        {
            a[i]++;
        }
        int maxi=0;
        for(int i=0;i<=100;i++)
        {
            maxi=Math.max(maxi,a[i]);
        }
        int ans=0;
        for(int i=0;i<=100;i++)
        {
            if(a[i]==maxi)
            {
                ans+=maxi;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
    
}
