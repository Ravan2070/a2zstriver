/*
    RAVAN_2070
    Problem: Array Search

    Pattern: Linear Search

    Learning:
    
    Complete reference:
    1] https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
    
    Optimal Solution [Accepted] 

    Time Complexity : 
    Worst case scenario: O(n) as we need to traverse array once
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using constant count of variables

  */ 
class Solution {
    public int search(int arr[], int x) {
        // code here
        int i,size = arr.length;
        
        for(i = 0; i < size; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return -1;
        
    }
}
