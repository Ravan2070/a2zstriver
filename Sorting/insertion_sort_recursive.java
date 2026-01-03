/*
    RAVAN_2070
    Problem: Insertion Sort Recursive
    
    Pattern:
    
    Learning: 
    Insertion sort builds a sorted array by taking one element at a time and inserting it into its correct position in the already sorted portion, starting from the second element and repeating until the array is fully sorted.

    Recursion is implemented by defining a base case, breaking the problem into smaller subproblems using a recursive call, ensuring each call moves toward the base case, and combining subproblem results to solve the original problem.

    Complete reference:
    1] https://leetcode.com/problems/sort-an-array/
    2] https://www.geeksforgeeks.org/dsa/insertion-sort-algorithm/
    3] https://www.geeksforgeeks.org/dsa/introduction-to-recursion-2/

    Time Complexity : O(N*N) .. This will happen when elements are in descending order
    Space Complexity : O(N) ..due to the recursive call stack (one recursive call per pass)
*/
class Solution {
    public int[] sortArray(int[] nums) {

        insertionSort(nums,1);
        return nums;
    }

    static void insertionSort(int[] nums, int keyIndex)
    {
        //Base case
        if(keyIndex == nums.length)
        {
            //As all the keys have been placed in the sorted position
            return;
        }
  
        int key = nums[keyIndex];
        int j = keyIndex - 1;
        while(j >= 0 && nums[j] > key)
        {
            nums[j + 1] = nums[j];
            j--;
        }
        nums[j+1] = key;//Insert key in its right position, for this pass/iteration/recursion call

        //Recursive call
        insertionSort(nums, keyIndex + 1);

    }

}