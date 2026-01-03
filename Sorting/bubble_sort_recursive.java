/*
    RAVAN_2070
    Problem: Recursive Bubble Sort
    
    Pattern:
    
    Learning: 
    Bubble sort repeatedly compares and swaps adjacent elements to gradually sort the array.
    After each pass, the largest unsorted element moves to its correct position at the end, so after k passes the last k elements are sorted.

    Recursion is implemented by defining a base case, breaking the problem into smaller subproblems using a recursive call, ensuring each call moves toward the base case, and combining subproblem results to solve the original problem.

    Complete reference:
    1] https://leetcode.com/problems/sort-an-array/
    2] https://www.geeksforgeeks.org/dsa/recursive-bubble-sort/
    3] https://www.geeksforgeeks.org/dsa/introduction-to-recursion-2/

    Time Complexity : O(N*N) .. This will happen when elements are in descending order
    Space Complexity : O(N) ..due to the recursive call stack (one recursive call per pass)
*/
class Solution {
    public int[] sortArray(int[] nums) {

        int lengthOfArray = nums.length;
        bubbleSort(nums, lengthOfArray);
        return nums;
    }

    static void bubbleSort(int[] nums, int lengthOfArray){

        if(lengthOfArray == 1){
            return;
        }

        int i;
        for(i = 0; i < lengthOfArray - 1; i++)
        {
            if(nums[i] > nums[i+1])
            {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }

        bubbleSort(nums, lengthOfArray - 1);
    }
}