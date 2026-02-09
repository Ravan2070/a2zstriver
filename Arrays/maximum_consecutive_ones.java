/*
    RAVAN_2070
    Problem: Max Consecutive Ones

    Pattern: Adhoc

    Learning: We need to find the longest streak of consecutive 1’s in a binary array. A simple idea is to traverse the array while maintaining a counter. Every time we encounter a 1, we increase the counter. If we encounter a 0, the streak breaks, so we reset the counter to 0. At each step, we track the maximum streak length seen so far.
    
    Complete reference:
    1] https://leetcode.com/problems/max-consecutive-ones/
    
    Optimal Solution [Sum of consecutive ones] [Accepted] 

    Time Complexity : 
    Worst case scenario: O(n) as we need to traverse through array to find sum.
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using constant count of variables 

  */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int i, sum, max;
        sum = max = 0;

        for(i = 0;i < nums.length ;i++)
        {
            if(nums[i] == 0)
            {
                sum = 0;
            }
            else
            {
                sum++;
                max = Math.max(sum, max);
            }
        }  

        return max;  
    }
}