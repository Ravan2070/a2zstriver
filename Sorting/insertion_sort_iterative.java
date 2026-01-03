/*
    RAVAN_2070
    Problem: Insertion Sort
    
    Pattern:
    
    Learning: 
    Insertion sort builds a sorted array by taking one element at a time and inserting it into its correct position in the already sorted portion, starting from the second element and repeating until the array is fully sorted.

    Complete reference:
    1] https://leetcode.com/problems/sort-an-array/
    2] https://www.geeksforgeeks.org/dsa/insertion-sort-algorithm/

    Time Complexity : O(N*N) .. This will happen when elements are in descending order
    Space Complexity : O(1) 
*/
class Solution {
    public int[] sortArray(int[] nums) {

        int lengthOfArray = nums.length;
        int i, j, key;//Key is the element to place in right position in already sorted position

        for(i = 1; i < lengthOfArray; i++)
        {
            key = nums[i];//In this pass/iteration unsorted array is [i,n-1]
            
            j = i - 1;
            while(j >= 0 && nums[j] > key)
            {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j+1] = key;//Insert key in its right position
        }
        return nums;
    }

}