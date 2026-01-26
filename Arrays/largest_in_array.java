/*
    RAVAN_2070
    Problem: Find the Largest element in an array

    Complete reference:
    1] https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

    Time Complexity : 
    Worst case scenario: O(n) as all the elements needs to be compared to find the maximum value
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using a single (constant) variable
   
*/
class Solution {
    public static int largest(int[] arr) {
        // code here
        
        int maxElement = -1;//As possible range of values starts from 0;
        int i;
        for(i = 0; i < arr.length; i++)
        {
            maxElement = Math.max(arr[i], maxElement);
        }
        
        return maxElement;
        
    }
}
