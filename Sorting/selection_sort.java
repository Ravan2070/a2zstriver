/*
    RAVAN_2070
    Problem: Selection Sort
    Pattern:
    Learning: Repeatedly select smallest element from unsorted portion and swap it in first unsorted position.
    Complete reference:
    1] https://leetcode.com/problems/sort-an-array/
    2] https://www.geeksforgeeks.org/dsa/selection-sort-algorithm-2/

    Time Complexity : O(N*N)
    Space Complexity : O(1)
*/
class Solution {
    public int[] sortArray(int[] nums) {
        int lengthOfArray = nums.length;
        int i,j;
        
        //Max we have n - 1 iterations, nth iteration is not required as in n-1th when second last
        //element is placed, last element is also placed at its right postion 
        for(i = 0; i < lengthOfArray - 1; i++) 
        {
            //In this iteration unsorted portion is [i,n - 1];
            j = i + 1; 
            int next_small_index = i; // As if any smaller element found swap will be position i (next position to fill)
            while(j < lengthOfArray)
            {
                if(nums[j] < nums[next_small_index])
                {
                    next_small_index = j;
                }
                j++;
            }

            if(nums[next_small_index] < nums[i])
            {
                int temp = nums[i];
                nums[i] = nums[next_small_index];
                nums[next_small_index] = temp;
            }
        }

        return nums;
    }
}