/*
    RAVAN_2070
    Problem: Quick Sort
    
    Pattern: Divide and Conquer
    
    Learning: 
    QuickSort is a divide-and-conquer sorting algorithm that selects a pivot, partitions the array so smaller elements go left and larger go right, and recursively sorts the sub-arrays until each has one element.

    Divide and Conquer is a problem-solving technique that solves a problem by breaking it into smaller independent subproblems, solving them recursively, and then combining their results; it works through three steps—divide, conquer, and merge.

    Complete reference:
    1] https://leetcode.com/problems/sort-an-array/
    2] https://www.geeksforgeeks.org/dsa/quick-sort-algorithm/
    3] https://www.geeksforgeeks.org/dsa/introduction-to-divide-and-conquer-algorithm/

    Time Complexity : 
    Best Case: (Ω(n log n)), Occurs when the pivot element divides the array into two equal halves.
    Average Case (θ(n log n)), On average, the pivot divides the array into two parts, but not necessarily equal.
    Worst Case: (O(n²)), Occurs when the smallest or largest element is always chosen as the pivot (e.g., sorted arrays).
    
    Space Complexity : 
    Worst-case scenario: O(n) due to unbalanced partitioning leading to a skewed recursion tree requiring a call stack of size O(n).
    Best-case scenario: O(log n) as a result of balanced partitioning leading to a balanced recursion tree with a call stack of size O(log n).
*/
class Solution {
    public int[] sortArray(int[] nums) {
        int size = nums.length;
        quicksort(0,size - 1, nums);
        return nums;
    }

    static void quicksort(int l, int r, int[] nums){
        
        if(l >= r) //Base Case: The recursion stops when there is only one element left in the sub-array, as a single element is already sorted. 
        return;

        int pivot_idx = partition(l,r,nums);
        quicksort(l,pivot_idx-1,nums);
        quicksort(pivot_idx+1,r,nums);
    }

    //Choice of Pivot: Always pick the first (or last) element as a pivot. The below implementation picks the last element as pivot. The problem with this approach is it ends up in the worst case when array is already sorted.
    //Lomuto Partition
    static int partition(int l, int r, int[] nums){

        int small = l - 1;
        int i = l;//i for iterator

        while(i < r)
        {
            if(nums[i] < nums[r])
            {
                small++;

                int temp = nums[small];
                nums[small] = nums[i];
                nums[i] = temp;
            }
            i++;
        }

        int temp = nums[small+1];
        nums[small+1] = nums[r];
        nums[r] = temp;

        int pivot_idx = small + 1;
        return pivot_idx;

    }



        

}