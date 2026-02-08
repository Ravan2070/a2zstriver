/*
    RAVAN_2070
    Problem: Move Zeroes

    Pattern: Two pointer

    Learning:
    
    Complete reference:
    1] https://leetcode.com/problems/move-zeroes/
    2]https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array

    
    Optimal Solution [Accepted] 

    Time Complexity : 
    Worst case scenario: O(n) as we need to traverse array once
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using constant count of variables

  */ 
class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;


        //unique_ptr: Responsible to hold first zero from left in hope to swap it with non-zero encountered by itr
        //itr: Responsbile to encounter with non-zero in order to be swapped with position held by unique_itr
        int unique_itr, itr;
        unique_itr = itr = 0;

        while(itr < size)
        {
            if(nums[itr] != 0)
            {
                int temp = nums[itr];
                nums[itr] = nums[unique_itr];
                nums[unique_itr] = temp;

                unique_itr++;

                //If unique_itr points to non-zero it will be simply iteration forward for both pointers as this situation
                //can encounter only in the start of array with non-zero elements in continous encounter
            }
            itr++;
        }
    }
}