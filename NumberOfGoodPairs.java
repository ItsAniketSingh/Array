/*   
    1512.
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.


*/


public class NumberOfGoodPairs {
    
    public int numIdenticalPairs(int[] A) {
        int ans = 0, cnt[] = new int[101];
        for (int a: A) {
            ans += cnt[a]++;
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }

    
}