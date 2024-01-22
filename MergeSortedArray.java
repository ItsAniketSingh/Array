/*
    88
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
    and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

 */

import java.util.Arrays;

public class MergeSortedArray {


    // One Way
    public static int [] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        return nums1;
    }

    // Seceond way
    public static int[] demo (int[] nums1, int m, int[] nums2, int n){
        
        int a = 0;
        int b = 0;
        int [] arr = new int[nums1.length];
        for(int i = 0; i< nums1.length; i++ ){
            if(nums1[a] <= nums2[b] && nums1[a] != 0){
                arr[i] = nums1[a];
                a++;
            }
            else{
                arr[i] = nums2[b];
                b++;
            }
        }
        return arr;
    }


    public static void main(String[] args) {

        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;
        nums1 = demo(nums1, m, nums2, n);
        for(int i = 0; i< nums1.length; i++){
            System.out.println(nums1[i]);
        }

    }
}
