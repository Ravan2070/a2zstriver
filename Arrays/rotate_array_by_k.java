/*
    RAVAN_2070
    Problem: Rotate Array

    Pattern: Adhoc

    Learning:
    We can get the rotated array in-place by reversing specific parts of the array. This works because rotating is just rearranging sections of the array.
   


    Complete reference:
    1] https://leetcode.com/problems/rotate-array/
    2] https://takeuforward.org/data-structure/rotate-array-by-k-elements
    

    
    Brute Force Solution [TLE] 

    Time Complexity : 
    Worst case scenario: O(n*n) when we rotate an array of size n to right n - 1 times actually in practice.
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using constant count of variables


    Optimal Solution [Accepted]

    Time Complexity:
    Worst case scenario: O(n) as we need to place all elements in their rotated final psotion if temp-array and copy back all to override
    in original array

    Space Complexity:
    Worst case scenario O(n) as we are using an temporary array


    Best Solution [Accepted]

    Learning:
    Instead of simulating each rotation one by one, we can get the rotated array in-place by reversing specific parts of the array. This works because rotating is just rearranging sections of the array.
    For right rotation last k element will become first k elements with order maintained and
    first n - k become last n - k elements order maintained

    Time Complexity:
    Worst case scenario: O(n) as we place an element in new position at max twice

    Space Complexity:
    Worst case scenario O(1) 
  */ 
class Solution {
    public void rotate(int[] nums, int k) {
        
        int size = nums.length;
        k = k % size;//As for k=n array position is same as k=0, k=n+1 matches k=1..
        reverse(nums, 0, size - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k ,size - 1);
       
    }

    static void reverse(int[] nums, int start, int end)
    {
         // Swap elements until start meets end
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
/*
    Brute Force Solution

    Time Complexity : 
    Worst case scenario: O(n*n) when we rotate an array of size n to right n - 1 times actually in practice.
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using constant count of variables

    class Solution {
    public void rotate(int[] nums, int k) {
        
        int i,size = nums.length;
        k = k % size;//As for k=n array position is same as k=0, k=n+1 matches k=1..
        for(i = 0; i < k; i++)
        {
            rotateByOne(nums);
        }
    }

    static void rotateByOne(int[] nums)
    {
        int i, last, size = nums.length;

        last = nums[size - 1];
        for(i = size - 1; i > 0; i--)
        {
            nums[i] = nums[i - 1];
        }
        nums[0] = last;

    } 
}
 */

 /**
 Optimal Solution [Accepted]

    Time Complexity:
    Worst case scenario: O(n) as we need to place all elements in their rotated final psotion if temp-array and copy back all to override
    in original array

    Space Complexity:
    Worst case scenario O(n) as we are using an temporary array

 class Solution {
    public void rotate(int[] nums, int k) {
        
        int size = nums.length;
        int[] temp = new int[size];
    
        k = k % size;//As for k=n array position is same as k=0, k=n+1 matches k=1..
        int old_ptr, new_ptr;
        
        for(old_ptr = 0, new_ptr = k; old_ptr < size; old_ptr++,new_ptr++)
        {
            temp[new_ptr % size] = nums[old_ptr];   
        }

        for(old_ptr = 0; old_ptr < size; old_ptr++)
        {
            nums[old_ptr] = temp[old_ptr];
        }
       
    }
}
 
  */