/*
    RAVAN_2070
    Problem: Check if Array Is Sorted and Rotated

    Learning from editorial:
    An array is sortable by rotation if it forms a non-decreasing sequence when viewed cyclically, with at most one break where a larger element is followed by a smaller one. Finding the smallest element helps identify the rotation point; if more than one such inversion exists, the array cannot be sorted by any rotation.

    Complete reference:
    1] https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
    2]https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/editorial/ (Read it is good)
    
    Learning:
    1] Consider [1,2,3,4] and all possible rotations we can see that in non-rotated array there is 0 inversion.
    whereas in rotated arrays there is max 1 adjacent inversion (ie greatest element followed by smallest element in this case 4 1).
    2]In unsorted arrays this inversion count will be > 1.
    3]While counting inversions we also compare n-1 and 0 index.
    
    Time Complexity : 
    Worst case scenario: O(n) as all the elements  needs to be compared once
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using a single variable (constant count)
   
*/
class Solution {
    public boolean check(int[] nums) {

        int i,size = nums.length;
        int inversion_count = 0;
        for(i = 0; i < size; i++)
        {
            if(nums[i] > nums[(i + 1) % size])//(i+1)%size to handle case where we compare last and first element
            {
                inversion_count++;
            }
        }
        
        if(inversion_count > 1) return false;
        return true;
    }
}