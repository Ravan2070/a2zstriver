/*
    RAVAN_2070
    Problem: Remove Duplicates from Sorted Array

    Pattern: Two pointer

    Learning:
    Use two pointers since the array is sorted. 
    Keep one pointer for the last unique element and scan with the other, copying only new values forward. 
    All unique elements end up grouped at the start.


    Complete reference:
    1] https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    2] https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/
    
        
    Time Complexity : 
    Worst case scenario: O(n) as all the elements  needs to be compared once
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using constant count of variables
   
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int unique_iterator,iterator,size = nums.length;
        int cnt = 1;
        for(unique_iterator = iterator = 0; iterator < size; iterator++)
        {
            if(nums[unique_iterator] != nums[iterator])
            {
                nums[unique_iterator+1] = nums[iterator];
                unique_iterator++;
                cnt++;
            }
        }
        return cnt;
    }
}