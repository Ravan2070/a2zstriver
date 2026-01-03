/*
    RAVAN_2070
    Problem: Merge Sort
    
    Pattern: Divide and Conquer
    
    Learning: 
    Merge sort is a stable, efficient sorting algorithm that uses the divide-and-conquer approach by recursively splitting the array into halves, sorting each half, and then merging the sorted halves to produce the final sorted array.

   Divide and Conquer is a problem-solving technique that solves a problem by breaking it into smaller independent subproblems, solving them recursively, and then combining their results; it works through three steps—divide, conquer, and merge.

    Complete reference:
    1] https://leetcode.com/problems/sort-an-array/
    2] https://www.geeksforgeeks.org/dsa/merge-sort/
    3] https://www.geeksforgeeks.org/dsa/introduction-to-divide-and-conquer-algorithm/

    Time Complexity : O(N*LOGN) 
    Space Complexity : O(N) ..Additional space is required for the temporary array used during merging.
*/
class Solution {
    public int[] sortArray(int[] nums) {

        int lengthOfArray = nums.length;
        mergeSort(nums,0,lengthOfArray - 1);
        return nums;
    }

    static void mergeSort(int[] nums, int l, int r)
    {
        if(l < r)
        {
            int m = l + (r - l)/2;
            
            mergeSort(nums, l, m);
            mergeSort(nums, m+1, r);
            
            merge(nums,l,m,r);
        }
        
    }

    static void merge(int[] nums, int l, int m, int r)
    {
        int lengthOfSubArray1 = m - l + 1;
        int lengthOfSubArray2 = r - m;

        int[] subArray1 = new int[lengthOfSubArray1];
        int[] subArray2 = new int[lengthOfSubArray2];

        int i;
        for(i = l; i <= m; i++)
        {
            subArray1[i - l] = nums[i];
        }

        for(i = m + 1; i <= r; i++)
        {
            subArray2[i - m - 1] = nums[i];
        }

        int j, k;
        i = j = 0;
        k = l;
        while(i < lengthOfSubArray1 && j < lengthOfSubArray2)
        {
            if(subArray1[i] < subArray2[j])
            {
                nums[k++] = subArray1[i++];
            }
            else
            {
                nums[k++] = subArray2[j++];
            }
        }

        while(i < lengthOfSubArray1)
        {
            nums[k++] = subArray1[i++];
        }

        while(j < lengthOfSubArray2)
        {
            nums[k++] = subArray2[j++];
        }

    }

}