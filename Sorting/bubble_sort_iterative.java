/*
    RAVAN_2070
    Problem: Bubble Sort
    Pattern:
    Learning: Bubble sort repeatedly compares and swaps adjacent elements to gradually sort the array.
After each pass, the largest unsorted element moves to its correct position at the end, so after k passes the last k elements are sorted.
    Complete reference:
    1] https://leetcode.com/problems/sort-an-array/
    2] https://www.geeksforgeeks.org/dsa/bubble-sort-algorithm/

    Time Complexity : O(N*N) .. This will happen when elements are in descending order
    Space Complexity : O(1)
*/
class Solution {
    public int[] sortArray(int[] nums) {

        int lengthOfArray = nums.length;

        int iteration, i;

        for(iteration = 1; iteration <= lengthOfArray - 1; iteration++)//In total n-1 iterations array will be sorted
        {
            boolean swapped = false;
            for(i = 0; i < lengthOfArray - iteration; i++)//This inner loop governs the interval which is still unsorted
            {
                if(nums[i] > nums[i + 1])//wrong order hence swap
                {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;

                    swapped = true;
                }
            }

            if(swapped == false)
            {
                //There was no swap meaning all the elements are in sorted order now, no need to continue.
                break;
            }
        }

        return nums;
    }
}